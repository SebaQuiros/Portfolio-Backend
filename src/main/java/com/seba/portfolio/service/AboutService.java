package com.seba.portfolio.service;

import com.seba.portfolio.model.About;
import com.seba.portfolio.repository.AboutRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutService implements IAboutService{

    @Autowired
    public AboutRepository aboutRepo;
    
    @Override
    public List<About> getAbout() {
        return aboutRepo.findAll();
    }

    @Override
    public void postAbout(About about) {
         aboutRepo.save(about);
    }

    @Override
    public void deleteAbout(Long id) {
        aboutRepo.deleteById(id);
    }
    
}
