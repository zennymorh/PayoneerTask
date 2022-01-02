package com.zennymorh.payoneertask.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.zennymorh.payoneertask.R;
import com.zennymorh.payoneertask.databinding.FragmentPaymentMethodOptionsBinding;
import com.zennymorh.payoneertask.model.Applicable;
import com.zennymorh.payoneertask.util.Status;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PaymentMethodOptionsFragment extends Fragment implements PaymentMethodAdapter.PaymentMethodSelectionListener {

    private FragmentPaymentMethodOptionsBinding binding;
    private PaymentMethodAdapter paymentMethodAdapter;
    PaymentMethodViewModel paymentMethodViewModel;

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPaymentMethodOptionsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        paymentMethodViewModel = new ViewModelProvider(this).get(PaymentMethodViewModel.class);

        paymentMethodAdapter = new PaymentMethodAdapter();
        paymentMethodAdapter.setPaymentMethodSelectionListener(this);
        binding.paymentMtdRecycler.setAdapter(paymentMethodAdapter);

        getPaymentNetworks(paymentMethodViewModel);
    }

    private void getPaymentNetworks(PaymentMethodViewModel paymentMethodViewModel) {
        paymentMethodViewModel.getPaymentNetworks().observe(getViewLifecycleOwner(), state -> {
            if (state.status == Status.LOADING) {
                displayProgressBar();
            } else if (state.status == Status.ERROR) {
                displayError(getString(R.string.error_str));
            } else if(state.status == Status.SUCCESS){
                List<Applicable> paymentNetworks = (List<Applicable>) state.data;
                displayResult(paymentNetworks);
            }else if(state.status == Status.N0_CONNECTION){
                displayError(getString(R.string.connection_error_text));
            }else if(state.status == Status.NOT_FOUND){
                displayError(getString(R.string.no_resources_found));
            }else if(state.status == Status.UNKNOWN_CODE){
                displayError(getString(R.string.unknown_error_occurred));
            }
        });
    }

    private void displayResult(List<Applicable> paymentNetworks) {
        binding.progressBar.setVisibility(View.GONE);
        binding.paymentMtdRecycler.setVisibility(View.VISIBLE);
        paymentMethodAdapter.setPaymentMethods(paymentNetworks);
        paymentMethodAdapter.notifyDataSetChanged();
    }

    private void displayError(String error) {
        binding.progressBar.setVisibility(View.GONE);
        binding.paymentMtdRecycler.setVisibility(View.GONE);

        Snackbar snackbar = Snackbar
                .make(requireView(), error, Snackbar.LENGTH_INDEFINITE)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        getPaymentNetworks(paymentMethodViewModel);
                    }
                });

        snackbar.show();
    }

    private void displayProgressBar() {
        binding.progressBar.setVisibility(View.VISIBLE);
        binding.paymentMtdRecycler.setVisibility(View.GONE);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onPaymentMethodSelected(Applicable applicable) {
        Toast.makeText(requireContext(), "Payment Method selected", Toast.LENGTH_SHORT).show();
    }
}