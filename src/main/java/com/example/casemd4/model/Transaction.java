package com.example.casemd4.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    @ManyToOne
    User_category userCategory;
    @ManyToOne
    Transaction_type transactionType;
    @NotNull
    String name;
    @NotNull
    Double amount;
    @NotNull
    String location;
    @NotNull
    LocalDate date;
    @NotNull
    String description;
}
