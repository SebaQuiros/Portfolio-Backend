package com.seba.portfolio.model;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Education {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String button;
    private String occupation;
    private String title;
    private String link;
    private String subtitle;
    private String duration;
    @Column(length=1000)
    private ArrayList<String> description;
    
    public Education () {
    }

    public Education(Long id, String button, String occupation, String title, String link, String subtitle, String duration, ArrayList<String> description) {
        this.id = id;
        this.button = button;
        this.occupation = occupation;
        this.title = title;
        this.link = link;
        this.subtitle = subtitle;
        this.duration = duration;
        this.description = description;
    }
    
    
}
