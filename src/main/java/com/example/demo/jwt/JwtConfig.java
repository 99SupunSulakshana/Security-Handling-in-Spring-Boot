package com.example.demo.jwt;

import com.google.common.net.HttpHeaders;
import io.jsonwebtoken.security.Keys;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.crypto.SecretKey;

@ConfigurationProperties(prefix = "application.jwt")
public class JwtConfig {

    private String secretKey;
    private String tokenPrefix;
    private Integer tokenExirationAfterDays;


    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getTokenPrefix() {
        return tokenPrefix;
    }

    public void setTokenPrefix(String tokenPrefix) {
        this.tokenPrefix = tokenPrefix;
    }

    public Integer getTokenExirationAfterDays() {
        return tokenExirationAfterDays;
    }

    public void setTokenExirationAfterDays(Integer tokenExirationAfterDays) {
        this.tokenExirationAfterDays = tokenExirationAfterDays;
    }
    
    public String getAuthorizationHeader(){
        return HttpHeaders.AUTHORIZATION;
    }

}
