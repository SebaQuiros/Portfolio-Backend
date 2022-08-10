package com.seba.portfolio.controller;

import com.seba.portfolio.model.Education;
import com.seba.portfolio.service.IEducationsService;
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
public class EducationsController {
    
    @Autowired
    private IEducationsService educationsServ;
    
    @GetMapping("/educations")
    @ResponseBody
    public List<Education> getEducation () {
        return educationsServ.getEducations();
    }
    
    @PostMapping ("/educations")
    public void postEducation (@RequestBody Education education) {
        educationsServ.postEducation(education);
    }
    
    @PutMapping ("/educations")
    public void putEducation (@RequestBody Education education){
        educationsServ.postEducation(education);
    }
    @DeleteMapping ("/educations/{id}")
    public void deleteEducation (@PathVariable Long id) {
        educationsServ.deleteEducation(id);
    }
    
}
