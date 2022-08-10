package com.seba.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class About {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullName;
    private String occupation;
    private String mail;
    private String img;
    private String imgAlt;
    
    public About () {
    }

    public About(Long id, String fullName, String occupation, String img, String imgAlt) {
        this.id = id;
        this.fullName = fullName;
        this.occupation = occupation;
        this.img = img;
        this.imgAlt = imgAlt;
    }
    
    
}
