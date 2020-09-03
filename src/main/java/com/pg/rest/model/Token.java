package com.pg.rest.model;

public class Token {

    String access_token = "token_12345";
    int expires_in = 36000;
    String token_type = "Bearer";

    public String getAccess_token() {
        return access_token;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public String getToken_type() {
        return token_type;
    }
}
