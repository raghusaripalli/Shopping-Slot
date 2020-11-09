package com.productivity.simplyschedule.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String username;
}
