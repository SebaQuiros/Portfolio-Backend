package com.seba.portfolio.service;

import com.seba.portfolio.model.SkillSet;
import java.util.List;


public interface ISkillsService {
    
    public List<SkillSet> getSkills ();
    
    public void postSkillSet (SkillSet skillset);
    
    public void deleteSkillSet (Long id);
    
}
