package com.mortgageform.controller;

import java.util.List;

import com.mortgageform.entity.Loan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.mortgageform.service.LoanService;

import javax.validation.Valid;

@Controller
@RequestMapping("/loans")
public class LoanController {

    private LoanService loanService;

    public LoanController(LoanService theLoanService) {
        loanService = theLoanService;
    }

    @GetMapping("/new-form")
    public String createNewForm(Model theModel) {
        Loan theLoan = new Loan();
        theModel.addAttribute("loan", theLoan);
        return "/loans/new-form";
    }

    @PostMapping("/save-new-form")
    public String saveNewForm(@Valid @ModelAttribute("loan") Loan theLoan, BindingResult theBindingResult) {
        loanService.saveNewForm(theLoan);
        if (theBindingResult.hasErrors()) {
            return "/loans/new-form";
        } else {
            return "redirect:/loans/success";
        }
    }

    @GetMapping("/success")
    public String showSuccessMessage(Model theModel) {
        return "/loans/form-submitted";
    }

    @GetMapping("/confirm-form")
    public String confirmForm(@RequestParam("loanId") int theId, Model theModel) {
        Loan theLoan = loanService.findById(theId);
        theModel.addAttribute("loan", theLoan);
        return "/loans/confirm-form";
    }

    @PostMapping("/save-updated-form")
    public String saveUpdatedForm(@ModelAttribute("loan") Loan theLoan) {
        loanService.saveUpdatedForm(theLoan);
        return "redirect:/loans/list";
    }

    @GetMapping("/list")
    public String showListOfLoans(Model theModel) {
        List<Loan> theLoans = loanService.findAllByOrderByIdDesc();
        theModel.addAttribute("loans", theLoans);
        return "/loans/loans-list";
    }


    @GetMapping("/search")
    public String searchForm(@RequestParam("lastName") String lastName, Model theModel) {
        List<Loan> theLoans = loanService.searchBy(lastName);
        theModel.addAttribute("loans", theLoans);
        return "loans/loans-list";
    }

    @GetMapping("/delete")
    public String deleteForm(@RequestParam("loanId") int theId) {
        loanService.deleteById(theId);
        return "redirect:/loans/list";
    }
}


















