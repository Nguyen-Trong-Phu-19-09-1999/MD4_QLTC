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
    private Long id;
    @ManyToOne
    private User_category userCategory;
    @ManyToOne
    private Transaction_type transactionType;
    @NotNull
    private String name;
    @NotNull
    private Double amount;
    @NotNull
    private String location;
    @NotNull
    private LocalDate date;
    @NotNull
    private String description;
}
