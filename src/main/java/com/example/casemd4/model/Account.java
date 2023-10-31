package com.example.casemd4.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    @ManyToOne
    Roles_auth rolesAuth;
    @NotNull
    String email;
    @NotNull
    String userName;
    @NotNull
    String password;

    Boolean status;





}
