package com.chaeking.www.domain.value;

public class TokenValue {

    public record Token(
            String access_token,
            String refresh_token) { }
}