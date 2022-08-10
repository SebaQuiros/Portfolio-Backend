package com.seba.portfolio.service;

import com.seba.portfolio.model.About;
import java.util.List;


public interface IAboutService {
    
    public List<About> getAbout ();
    
    public void postAbout (About about);
    
    public void deleteAbout (Long id);
    
}
