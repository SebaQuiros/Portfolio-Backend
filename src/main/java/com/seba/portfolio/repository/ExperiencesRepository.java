package com.seba.portfolio.repository;

import com.seba.portfolio.model.Experience;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperiencesRepository extends JpaRepository <Experience, Long> {
    
    public List<Experience> findByOrderByIdDesc();
    
}
