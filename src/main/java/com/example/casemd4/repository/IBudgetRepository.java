package com.example.casemd4.repository;

import com.example.casemd4.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBudgetRepository extends JpaRepository<Budget, Long> {
}
