package com.mortgageform.service;

import java.util.List;
import java.util.Optional;

import com.mortgageform.entity.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mortgageform.dao.LoanRepository;

@Service
public class LoanServiceImpl implements LoanService {

    private LoanRepository loanRepository;

    @Autowired
    public LoanServiceImpl(LoanRepository theLoanRepository) {
        loanRepository = theLoanRepository;
    }

    @Override
    public void saveNewForm(Loan theLoan) {
        loanRepository.save(theLoan);
    }

    @Override
    public void saveUpdatedForm(Loan theLoan) {
        loanRepository.save(theLoan);
    }

    @Override
    public void deleteById(int theId) {
        loanRepository.deleteById(theId);
    }

    @Override
    public List<Loan> findAllByOrderByIdDesc() {
        return loanRepository.findAllByOrderByIdDesc();
    }

    @Override
    public Loan findById(int theId) {
        Optional<Loan> result = loanRepository.findById(theId);
        Loan theLoan = null;
        if (result.isPresent()) {
            theLoan = result.get();
        } else {
            throw new RuntimeException("Did not find loan id - " + theId);
        }
        return theLoan;
    }

    @Override
    public List<Loan> searchBy(String lastName) {
        List<Loan> results = null;
        if (lastName != null && (lastName.trim().length() > 0)) {
            results = loanRepository.findByLastName(lastName);
        } else {
            results = findAllByOrderByIdDesc();
        }
        return results;
    }
}






