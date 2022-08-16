package com.seba.portfolio.service;

import com.seba.portfolio.model.Project;
import com.seba.portfolio.repository.ProjectsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectsService implements IProjectsService {
    
    @Autowired
    public ProjectsRepository projectsRepo;
    
    @Override
    public List<Project> getProjects() {
        return projectsRepo.findByOrderByIdDesc();
    }

    @Override
    public void postProject(Project project) {
        projectsRepo.save(project);
    }

    @Override
    public void deleteProject(Long id) {
        projectsRepo.deleteById(id);
    }
    
}
