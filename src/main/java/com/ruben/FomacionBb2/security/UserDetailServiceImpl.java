package com.ruben.FomacionBb2.security;

import com.ruben.FomacionBb2.models.UserModel;
import com.ruben.FomacionBb2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserModel usuario= userRepository
                .findByEmail(email)
                .orElseThrow(()-> new UsernameNotFoundException("El usuario con email " + email+ " no existe"));
        return new UserDetailsImpl(usuario);
    }
}
