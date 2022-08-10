package com.seba.portfolio.service;

import com.seba.portfolio.model.Education;
import com.seba.portfolio.repository.EducationsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationsService implements IEducationsService{
    
    @Autowired
    public EducationsRepository educationsRepo;

    @Override
    public List<Education> getEducations() {
        return educationsRepo.findAll();
    }

    @Override
    public void postEducation(Education education) {
        educationsRepo.save(education);
    }

    @Override
    public void deleteEducation(Long id) {
        educationsRepo.deleteById(id);
    }
    
}
