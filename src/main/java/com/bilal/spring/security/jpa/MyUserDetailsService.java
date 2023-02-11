package com.bilal.spring.security.jpa;

import com.bilal.spring.security.jpa.models.MyUserDetails;
import com.bilal.spring.security.jpa.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> user = userRepository.findUserByUserName(username);
        user.orElseThrow(()-> new UsernameNotFoundException("could not found: "+username));

        return user.map(MyUserDetails::new).get();
    }
}
