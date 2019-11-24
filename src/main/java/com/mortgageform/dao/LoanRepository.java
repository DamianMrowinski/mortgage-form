package com.mortgageform.dao;

import com.mortgageform.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRepository extends JpaRepository<Loan, Integer> {

    List<Loan> findAllByOrderByIdDesc();

    List<Loan> findByLastName(String LastName);
}
