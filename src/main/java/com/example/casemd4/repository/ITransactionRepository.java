package com.example.casemd4.repository;

import com.example.casemd4.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITransactionRepository extends JpaRepository<Transaction, Long> {
}
