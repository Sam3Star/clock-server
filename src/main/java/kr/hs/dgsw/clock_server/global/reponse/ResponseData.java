package kr.hs.dgsw.clock_server.global.reponse;

import org.springframework.http.HttpStatus;

public record ResponseData<T>(
        int status,
        String message,
        T data
) {
    public static <T> ResponseData<T> of(HttpStatus status, String message, T data) {
        return new ResponseData<>(status.value(), message, data);
    }
}
