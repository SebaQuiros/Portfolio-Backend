package com.seba.portfolio.repository;

import com.seba.portfolio.model.SkillSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository <SkillSet, Long> {
    
    public void findAllById(Long id);
    
}
