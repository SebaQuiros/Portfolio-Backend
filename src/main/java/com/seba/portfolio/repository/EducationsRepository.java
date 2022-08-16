package com.seba.portfolio.repository;

import com.seba.portfolio.model.Education;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationsRepository extends JpaRepository <Education, Long>{
    
    public List<Education> findByOrderByIdDesc();
            
}
