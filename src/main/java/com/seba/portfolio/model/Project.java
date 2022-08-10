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
public class Project {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private String link;
    private String title;
    @Column(length=1000)
    private String description;
    private ArrayList<String> tools;
    private String img;
    private String imgAlt;

    public Project () {
    }

    public Project(Long id, String type, String link, String title, String description, ArrayList<String> tools, String img, String imgAlt) {
        this.id = id;
        this.type = type;
        this.link = link;
        this.title = title;
        this.description = description;
        this.tools = tools;
        this.img = img;
        this.imgAlt = imgAlt;
    }
}
