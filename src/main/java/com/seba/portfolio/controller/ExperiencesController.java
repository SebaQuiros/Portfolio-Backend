package com.seba.portfolio.controller;

import com.seba.portfolio.model.Experience;
import com.seba.portfolio.service.IExperiencesService;
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
public class ExperiencesController {
    
    @Autowired
    private IExperiencesService experiencesServ;
    
    @GetMapping("/experiences")
    @ResponseBody
    public List<Experience> getExperiences () {
        return experiencesServ.getExperiences();
    }
    
    @PostMapping ("/experiences")
    public void postExperience (@RequestBody Experience experience) {
        experiencesServ.postExperience(experience);
    }
    
    @PutMapping ("/experiences")
    public void putExperience (@RequestBody Experience experience){
        experiencesServ.postExperience(experience);
    }
    @DeleteMapping ("/experiences/{id}")
    public void deleteExperience (@PathVariable Long id) {
        experiencesServ.deleteExperience(id);
    }
}
