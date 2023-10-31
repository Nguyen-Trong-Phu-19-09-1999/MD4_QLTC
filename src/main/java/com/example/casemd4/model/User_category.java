package com.example.casemd4.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class User_category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @ManyToOne
    private User_information userInformation;
    @ManyToOne
    private Category_type categoryType;
    @NotNull
    private String name;
    @NotNull
    private String color;
    @NotNull
    private String description;
}
