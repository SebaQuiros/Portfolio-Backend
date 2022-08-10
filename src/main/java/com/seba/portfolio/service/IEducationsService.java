package com.seba.portfolio.service;

import com.seba.portfolio.model.Education;
import java.util.List;


public interface IEducationsService {
    
    public List<Education> getEducations ();
    
    public void postEducation (Education education);
    
    public void deleteEducation (Long id);
    
}
