package com.example.casemd4.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    @ManyToOne
    User_category userCategory;
    @NotNull
    Double amount;
    @NotNull
    LocalDate fromDate;
    @NotNull
    LocalDate toDate;
    @NotNull
    String description;
}
