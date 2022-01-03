package com.zennymorh.payoneertask.ui.paymentmethod;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.zennymorh.payoneertask.R;
import com.zennymorh.payoneertask.model.Applicable;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class PaymentMethodAdapter extends RecyclerView.Adapter<PaymentMethodAdapter.PaymentMethodViewHolder> {

    private List<Applicable> paymentMethods = new ArrayList<>();
    private PaymentMethodSelectionListener paymentMethodSelectionListener;

    @NonNull
    @NotNull
    @Override
    public PaymentMethodViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.payment_method_item, parent, false);
        return new PaymentMethodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PaymentMethodViewHolder holder, int position) {
        if(paymentMethods.get(position) != null){
            Applicable applicable = paymentMethods.get(position);
            holder.methodName.setText(applicable.getLabel());
            Glide.with(holder.methodLogo.getContext())
                    .load(applicable.getLinks().getLogo())
                    .into(holder.methodLogo);

            holder.itemView.setOnClickListener(view -> paymentMethodSelectionListener.onPaymentMethodSelected(applicable));
        }
    }

    @Override
    public int getItemCount() {
        return paymentMethods.size();
    }

    public void setPaymentMethods(List<Applicable> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public void setPaymentMethodSelectionListener(PaymentMethodSelectionListener paymentMethodSelectionListener) {
        this.paymentMethodSelectionListener = paymentMethodSelectionListener;
    }

    public static class PaymentMethodViewHolder extends RecyclerView.ViewHolder {

        private final ImageView methodLogo;
        private final TextView methodName;

        public PaymentMethodViewHolder(@NonNull View view) {
            super(view);
            methodLogo = itemView.findViewById(R.id.method_logo);
            methodName = itemView.findViewById(R.id.method_name);
        }
    }

    interface PaymentMethodSelectionListener{
        void onPaymentMethodSelected(Applicable applicable);
    }
}
