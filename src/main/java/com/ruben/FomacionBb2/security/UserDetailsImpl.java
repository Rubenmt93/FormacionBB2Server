package com.ruben.FomacionBb2.security;

import com.ruben.FomacionBb2.enums.RolUserEnum;
import com.ruben.FomacionBb2.models.UserModel;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

@AllArgsConstructor
public class UserDetailsImpl implements UserDetails{

    private  final UserModel usuario;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    public String getPassword() {
        return usuario.getPassword();
    }

    @Override
    public String getUsername() {
        return usuario.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getNombre(){
        return usuario.getName();
    }

    public String getRoles(){

        String roles= "";
        for(RolUserEnum a: usuario.getRol()){
            roles+= a.toString()+" ";
        }
        return roles;
    }

    public Long getId(){
        return usuario.getIdUser();
    }
}
