package com.cognizant.loan.models;

public class Loan {
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEmi() {
        return emi;
    }

    public void setEmi(int emi) {
        this.emi = emi;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    private String number;
    private String type;
    private int emi;
    private int tenure;

    public Loan(String number, String type, int emi, int tenure) {
        this.number = number;
        this.type = type;
        this.emi = emi;
        this.tenure = tenure;
    }
}
