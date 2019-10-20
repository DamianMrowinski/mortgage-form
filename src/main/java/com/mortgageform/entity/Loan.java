package com.mortgageform.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loan")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

//    @NotNull(message = "is required")
    @Column(name = "sales_price")
    private Integer salesPrice;

    @Column(name = "down_payment")
    private Integer downPayment;

    @Column(name = "mortgage_term")
    private Integer mortgageTerm;

    @Column(name = "length_of_employment")
    private Integer lengthOfEmployment;

    @Column(name = "monthly_income")
    private Integer monthlyIncome;

    @Column(name = "monthly_commitment")
    private Integer monthlyCommitment;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

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

    public Integer getLengthOfEmployment() {
        return lengthOfEmployment;
    }

    public void setLengthOfEmployment(Integer lengthOfEmployment) {
        this.lengthOfEmployment = lengthOfEmployment;
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
                ", lengthOfEmployment=" + lengthOfEmployment +
                ", monthlyIncome=" + monthlyIncome +
                ", monthlyCommitment=" + monthlyCommitment +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", status=" + status +
                '}';
    }
}











