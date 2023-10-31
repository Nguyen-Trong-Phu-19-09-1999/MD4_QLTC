package com.example.casemd4.repository;

import com.example.casemd4.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountRepository extends JpaRepository<Account, Long> {
}
