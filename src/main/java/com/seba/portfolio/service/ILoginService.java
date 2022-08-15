package com.seba.portfolio.service;

import com.seba.portfolio.model.User;


public interface ILoginService {
    
    public void postUser (User user);
    
    public boolean checkLogin(User user);
    
}
