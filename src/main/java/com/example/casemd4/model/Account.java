package com.example.casemd4.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @ManyToOne
    private Roles_auth rolesAuth;
    @NotNull
    private String email;
    @NotNull
    private String userName;
    @NotNull
    private String password;

    private Boolean status;





}
