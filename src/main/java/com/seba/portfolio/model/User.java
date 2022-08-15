package com.seba.portfolio.model;

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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String mail;
    private String password;

    @Column(name = "mailUser")
    private String mailUser;

    public User() {
    }

    public User(Long id, String mail, String password) {
        this.id = id;
        this.mail = mail;
        this.password = password;
    }

}
