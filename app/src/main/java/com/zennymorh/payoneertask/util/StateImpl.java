package com.zennymorh.payoneertask.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class StateImpl<T> {

    @NonNull
    public final Status status;

    @Nullable
    public final T data;

    public StateImpl(@NonNull Status status, @Nullable T data) {
        this.status = status;
        this.data = data;
    }

    public static <T> StateImpl<T> success(@Nullable T data) {
        return new StateImpl<>(Status.SUCCESS, data);
    }

    public static <T> StateImpl<T> error(@Nullable T data) {
        return StateUtil.decodeErrorState(data);
    }

    public static <T> StateImpl<T> loading() {
        return new StateImpl<>(Status.LOADING, null);
    }
}

