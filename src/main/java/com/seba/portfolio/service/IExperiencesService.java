package com.seba.portfolio.service;

import com.seba.portfolio.model.Experience;
import java.util.List;


public interface IExperiencesService {
    
    public List<Experience> getExperiences ();
    
    public void postExperience (Experience experience);
    
    public void deleteExperience (Long id);
}
