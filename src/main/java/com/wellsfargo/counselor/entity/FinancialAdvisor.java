package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Advisor_ID;

    @Column(nullable = false)
    private String Advisor_FName;

    @Column(nullable = false)
    private String Advisor_LName;

    @Column(nullable = false)
    private String Advisor_Address;

    @Column(nullable = false)
    private String Advisor_Phone;

    @Column(nullable = false)
    private String Advisor_Email;

    @Column(nullable = false)
    private String User_Name;

    @Column(nullable = false,unique = true)
    private String Password;

    protected FinancialAdvisor() {

    }

    public FinancialAdvisor(String Advisor_FName, String Advisor_LName, String Advisor_Address, String Advisor_Phone, String Advisor_Email, String User_Name, String Password) {
        this.Advisor_FName = Advisor_FName;
        this.Advisor_LName = Advisor_LName;
        this.Advisor_Address = Advisor_Address;
        this.Advisor_Phone = Advisor_Phone;
        this.Advisor_Email = Advisor_Email;
        this.User_Name = User_Name;
        this.Password = Password;
    }

    public Long getAdvisor_ID() {
        return Advisor_ID;
    }

    public String getAdvisor_FName() {
        return Advisor_FName;
    }

    public void setAdvisor_FName(String Advisor_FName) {
        this.Advisor_FName = Advisor_FName;
    }

    public String getAdvisor_LName() {
        return Advisor_LName;
    }

    public void setAdvisor_LName(String Advisor_LName) {
        this.Advisor_LName = Advisor_LName;
    }

    public String getAdvisor_Address() {
        return Advisor_Address;
    }

    public void setAdvisor_Address(String Advisor_Address) {
        this.Advisor_Address = Advisor_Address;
    }

    public String getAdvisor_Phone() {
        return Advisor_Phone;
    }

    public void setAdvisor_Phone(String Advisor_Phone) {
        this.Advisor_Phone = Advisor_Phone;
    }

    public String getAdvisor_Email() { return Advisor_Email; }

    public void setAdvisor_Email(String Advisor_Email) {
        this.Advisor_Email = Advisor_Email;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String User_Name) {
        this.User_Name = User_Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}
