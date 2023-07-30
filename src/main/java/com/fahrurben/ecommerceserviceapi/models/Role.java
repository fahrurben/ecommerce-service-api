package com.fahrurben.ecommerceserviceapi.models;

import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements GrantedAuthority {

    public static final String SUPER_ADMIN = "SUPER_ADMIN";
    public static final String USER_ADMIN = "USER_ADMIN";

    private String authority;

}
