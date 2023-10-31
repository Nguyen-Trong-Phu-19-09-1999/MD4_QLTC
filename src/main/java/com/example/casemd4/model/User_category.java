package com.example.casemd4.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class User_category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    @ManyToOne
    User_information userInformation;
    @ManyToOne
    Category_type categoryType;
    @NotNull
    String name;
    @NotNull
    String color;
    @NotNull
    String description;
}
