package com.example.demo.Service;

import com.example.demo.Form.UserForm;
import com.example.demo.domain.User;
import com.example.demo.persisitence.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;


    @Override
    public User userRegister(UserForm userForm){
        User user=new User();
        user.setId(System.currentTimeMillis());
        user.setUserName(userForm.getUserName());
        user.setPassword(userForm.getPassword());
        user.setEmail(userForm.getEmail());
        return userDAO.save(user);
    }
}
