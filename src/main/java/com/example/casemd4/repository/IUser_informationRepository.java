package com.example.casemd4.repository;

import com.example.casemd4.model.Category_type;
import com.example.casemd4.model.User_information;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUser_informationRepository extends JpaRepository<User_information, Long> {
}
