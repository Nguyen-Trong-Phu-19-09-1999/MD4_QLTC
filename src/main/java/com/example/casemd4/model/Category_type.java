package com.example.casemd4.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Category_type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    @NotNull
    String name;
}
