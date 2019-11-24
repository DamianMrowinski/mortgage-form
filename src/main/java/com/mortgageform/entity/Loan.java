package com.mortgageform.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "loan")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull(message = "Enter sales price")
    @Min(value = 100000, message = "Sales price - minimum value 100 000 PLN")
    @Column(name = "sales_price")
    private Integer salesPrice;

    @NotNull(message = "Enter down payment")
    @Min(value = 5000, message = "Down payment - minimum value 5000 PLN")
    @Column(name = "down_payment")
    private Integer downPayment;

    @NotNull(message = "Enter mortgage term")
    @Min(value = 1, message = "Mortgage term - minimum 1 year, maximum 30 years")
    @Max(value = 30, message = "Mortgage term - minimum 1 year, maximum 30 years")
    @Column(name = "mortgage_term")
    private Integer mortgageTerm;

    @NotNull(message = "Enter monthly income")
    @Min(value = 2000, message = "Monthly income - minimum 2000 PLN per month")
    @Column(name = "monthly_income")
    private Integer monthlyIncome;

    @NotNull(message = "Enter monthly commitment")
    @Min(value = 500, message = "Monthly commitment - minimum 500 PLN per month")
    @Column(name = "monthly_commitment")
    private Integer monthlyCommitment;

    @NotNull(message = "Enter first name")
    @Size(min = 2, max = 30, message = "Enter last name")
    @Column(name = "first_name")
    private String firstName;

    @NotNull(message = "Enter first name")
    @Size(min = 2, max = 30, message = "Enter last name")
    @Column(name = "last_name")
    private String lastName;

    @NotNull(message = "Enter phone number")
    @Column(name = "phone_number")
    private Integer phoneNumber;

    @Column(name = "status")
    private String status;

    public Loan() {
    }

    public Loan(int id, Integer salesPrice, Integer downPayment, Integer mortgageTerm, Integer monthlyIncome, Integer monthlyCommitment, String firstName, String lastName, Integer phoneNumber, String status) {
        this.id = id;
        this.salesPrice = salesPrice;
        this.downPayment = downPayment;
        this.mortgageTerm = mortgageTerm;
        this.monthlyIncome = monthlyIncome;
        this.monthlyCommitment = monthlyCommitment;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    public Loan(Integer salesPrice, Integer downPayment, Integer mortgageTerm, Integer monthlyIncome, Integer monthlyCommitment, String firstName, String lastName, Integer phoneNumber, String status) {
        this.salesPrice = salesPrice;
        this.downPayment = downPayment;
        this.mortgageTerm = mortgageTerm;
        this.monthlyIncome = monthlyIncome;
        this.monthlyCommitment = monthlyCommitment;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Integer salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Integer getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(Integer downPayment) {
        this.downPayment = downPayment;
    }

    public Integer getMortgageTerm() {
        return mortgageTerm;
    }

    public void setMortgageTerm(Integer mortgageTerm) {
        this.mortgageTerm = mortgageTerm;
    }

    public Integer getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(Integer monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public Integer getMonthlyCommitment() {
        return monthlyCommitment;
    }

    public void setMonthlyCommitment(Integer monthlyCommitment) {
        this.monthlyCommitment = monthlyCommitment;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", salesPrice=" + salesPrice +
                ", downPayment=" + downPayment +
                ", mortgageTerm=" + mortgageTerm +
                ", monthlyIncome=" + monthlyIncome +
                ", monthlyCommitment=" + monthlyCommitment +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", status=" + status +
                '}';
    }
}











