package com.seba.portfolio.service;

import com.seba.portfolio.model.Project;
import java.util.List;


public interface IProjectsService {
    
    public List<Project> getProjects ();
    
    public void postProject (Project project);
    
    public void deleteProject (Long id);
}
