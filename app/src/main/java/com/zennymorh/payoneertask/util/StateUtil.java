package com.zennymorh.payoneertask.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.IOException;

import retrofit2.HttpException;

public class StateUtil {
    public static <T> StateImpl<T> decodeErrorState(@Nullable T data){
        StateImpl<T> error;
        if (data instanceof HttpException) {
            error = parseHttpException(data);
        } else if (data instanceof IOException) {
            error = new StateImpl<>(Status.N0_CONNECTION, data);
        } else {
            error = new StateImpl<>(Status.ERROR, data);
        }
        return error;
    }

    @NonNull
    private static <T> StateImpl<T> parseHttpException(@NonNull T data) {
        StateImpl<T> error;
        HttpException exception = (HttpException) data;
        switch (exception.code()) {
            case 404:
                error = new StateImpl<>(Status.NOT_FOUND, data);
                break;
            case 500:
                error = new StateImpl<>(Status.SERVER_ERROR, data);
                break;
            default:
                error = new StateImpl<>(Status.UNKNOWN_CODE, data);
                break;
        }
        return error;
    }
}
