package com.seba.portfolio.controller;

import com.seba.portfolio.model.SkillSet;
import com.seba.portfolio.service.ISkillsService;
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
public class SkillsController {
    
    @Autowired
    private ISkillsService skillsServ;
    
    @GetMapping("/skills")
    @ResponseBody
    public List<SkillSet> getSkills () {
        return skillsServ.getSkills();
    }
    
    @PostMapping ("/skills")
    public void postSkillSet (@RequestBody SkillSet skillset) {
        skillsServ.postSkillSet(skillset);
    }
    
    @PutMapping ("/skills")
    public void putSkillSet (@RequestBody SkillSet skillset){
        skillsServ.postSkillSet(skillset);
    }
    @DeleteMapping ("/skills/{id}")
    public void deleteSkillSet (@PathVariable Long id) {
        skillsServ.deleteSkillSet(id);
    }
}
