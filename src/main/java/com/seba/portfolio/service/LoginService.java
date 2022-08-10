package com.seba.portfolio.service;

import com.seba.portfolio.model.User;
import com.seba.portfolio.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;
    
    public void addUser(User user){
        loginRepository.save(user);
    }
    
    public boolean checkLogin(User user){
        User currentUser = loginRepository.findByMailUser(user.getMailUser());
        return (currentUser != null)&&(user.getPasswordUser().equals(currentUser.getPasswordUser()));
}
}
