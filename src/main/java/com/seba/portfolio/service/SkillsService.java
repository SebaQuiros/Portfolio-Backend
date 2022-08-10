package com.seba.portfolio.service;

import com.seba.portfolio.model.SkillSet;
import com.seba.portfolio.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService{

    @Autowired
    public SkillsRepository skillsRepo;
    
    @Override
    public List<SkillSet> getSkills() {
        return skillsRepo.findAll();
    }

    @Override
    public void postSkillSet(SkillSet skillset) {
        skillsRepo.save(skillset);
    }
    
}
