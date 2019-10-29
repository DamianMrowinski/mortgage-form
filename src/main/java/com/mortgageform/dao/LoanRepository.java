package com.mortgageform.dao;

import java.util.List;

import com.mortgageform.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Integer> {

    List<Loan> findAllByOrderByIdDesc();

    List<Loan> findByLastName(String LastName);
}
