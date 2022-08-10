package com.seba.portfolio.controller;

import com.seba.portfolio.model.Project;
import com.seba.portfolio.service.IProjectsService;
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
public class ProjectsController {
    
    @Autowired
    private IProjectsService experiencesServ;
    
    @GetMapping("/projects")
    @ResponseBody
    public List<Project> getProjects () {
        return experiencesServ.getProjects();
    }
    
    @PostMapping ("/projects")
    public void postProject (@RequestBody Project project) {
        experiencesServ.postProject(project);
    }
    
    @PutMapping ("/projects")
    public void putProject (@RequestBody Project project){
        experiencesServ.postProject(project);
    }
    @DeleteMapping ("/projects/{id}")
    public void deleteProject (@PathVariable Long id) {
        experiencesServ.deleteProject(id);
    }
}
