
package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.User;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(int id) {

        return new User(id, "Bala");
    }
}
