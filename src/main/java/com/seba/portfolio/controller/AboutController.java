package com.seba.portfolio.controller;

import com.seba.portfolio.model.About;
import com.seba.portfolio.service.IAboutService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
public class AboutController {
    
    @Autowired
    private IAboutService aboutServ;
    
    @GetMapping("/about")
    @ResponseBody
    public List<About> getAbout () {
        return aboutServ.getAbout();
    }
    
    @PostMapping ("/about")
    public void postAbout (@RequestBody About about) {
        aboutServ.postAbout(about);
    }
    
    @PutMapping ("/about")
    public void putAbout (@RequestBody About about){
        aboutServ.postAbout(about);
    }
    @DeleteMapping ("/about/{id}")
    public void deleteAbout (@PathVariable Long id) {
        aboutServ.deleteAbout(id);
    }
}
