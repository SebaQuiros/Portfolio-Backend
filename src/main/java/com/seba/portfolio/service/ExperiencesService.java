package com.seba.portfolio.service;

import com.seba.portfolio.model.Experience;
import com.seba.portfolio.repository.ExperiencesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperiencesService implements IExperiencesService {

    @Autowired
    public ExperiencesRepository experiencesRepo;
    
    @Override
    public List<Experience> getExperiences() {
        return experiencesRepo.findAll();
    }

    @Override
    public void postExperience(Experience experience) {
        experiencesRepo.save(experience);
    }

    @Override
    public void deleteExperience(Long id) {
        experiencesRepo.deleteById(id);
    }
    
}
