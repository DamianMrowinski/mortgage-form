package com.mortgageform.service;

import java.util.List;

import com.mortgageform.entity.Loan;

public interface LoanService {

    void saveNewForm(Loan theLoan);

    void saveUpdatedForm(Loan theLoan);

    void deleteById(int theId);

    List<Loan> findAllByOrderByIdDesc();

    Loan findById(int theId);

    List<Loan> searchBy(String lastName);
}
