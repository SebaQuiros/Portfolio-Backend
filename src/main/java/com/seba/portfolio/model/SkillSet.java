package com.seba.portfolio.model;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SkillSet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private String title;
    @Column(length = 1000)
    private String description;
    private ArrayList<String> tools;

    public SkillSet() {
    }

    public SkillSet(Long id, String type, String title, String description, ArrayList tools) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.description = description;
        this.tools = tools;
    }

}
