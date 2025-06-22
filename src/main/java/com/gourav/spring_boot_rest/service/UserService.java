package com.gourav.spring_boot_rest.service;


import com.gourav.spring_boot_rest.Repo.UserRepo;
import com.gourav.spring_boot_rest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

    public User saveUser(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());//just to get output in logs
        return  repo.save(user);

    }
}
