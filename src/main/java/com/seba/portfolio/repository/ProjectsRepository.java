package com.seba.portfolio.repository;

import com.seba.portfolio.model.Project;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectsRepository extends JpaRepository <Project, Long> {
    
    public List<Project> findByOrderByIdDesc();
    
}
