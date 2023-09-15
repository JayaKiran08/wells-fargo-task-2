package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.springframework.aop.Advisor;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Client_ID;

    @Column(nullable = false)
    private String Client_FName;

    @Column(nullable = false)
    private String Client_LName;

    @Column(nullable = false)
    private String Client_Address;

    @Column(nullable = false)
    private String Client_Phone;

    @Column(nullable = false)
    private String Client_Email;

    @ManyToOne
    @JoinColumn(name = "Advisor_ID", nullable = false)
    private FinancialAdvisor advisor;

    protected Client() {

    }

    public Client(String Client_FName, String Client_LName, String Client_Address, String Client_Phone, String Client_Email, FinancialAdvisor advisor) {
        this.Client_FName = Client_FName;
        this.Client_LName = Client_LName;
        this.Client_Address = Client_Address;
        this.Client_Phone = Client_Phone;
        this.Client_Email = Client_Email;
        this.advisor = advisor;
    }

    public Long getClient_ID() {
        return Client_ID;
    }

    public String getClient_FName() {
        return Client_FName;
    }

    public void setClient_FName(String Client_FName) {
        this.Client_FName = Client_FName;
    }

    public String getClient_LName() {
        return Client_LName;
    }

    public void setClient_LName(String Client_LName) {
        this.Client_LName = Client_LName;
    }

    public String getClient_Address() {
        return Client_Address;
    }

    public void setClient_Address(String Client_Address) { this.Client_Address = Client_Address; }

    public String getClient_Phone() {
        return Client_Phone;
    }

    public void setClient_Phone(String Client_Phone) {
        this.Client_Phone = Client_Phone;
    }

    public String getClient_Email() { return Client_Email; }

    public void setClient_Email(String Client_Email) {
        this.Client_Email = Client_Email;
    }
}
