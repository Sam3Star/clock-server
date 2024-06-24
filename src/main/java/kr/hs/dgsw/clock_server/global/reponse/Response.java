package kr.hs.dgsw.clock_server.global.reponse;

import org.springframework.http.HttpStatus;

public record Response(int status, String message) {
    public static Response of(HttpStatus status, String message) {
        return new Response(status.value(), message);
    }
}
