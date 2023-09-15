package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Security_ID;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String Category;

    @Column(nullable = false)
    private Date PurchaseDate;

    @Column(nullable = false)
    private double PurchasePrice;

    @Column(nullable = false)
    private int Quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio Portfolio;

    protected Security() {}

    public Security(String Name, String Category, Date PurchaseDate, double PurchasePrice, int Quantity, Portfolio Portfolio) {
        this.Name = Name;
        this.Category = Category;
        this.PurchaseDate = PurchaseDate;
        this.PurchasePrice = PurchasePrice;
        this.Quantity = Quantity;
        this.Portfolio = Portfolio;
    }

    public Long getSecurityId() {
        return Security_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public Date getPurchaseDate() {
        return PurchaseDate;
    }

    public void setPurchaseDate(Date PurchaseDate) {
        this.PurchaseDate = PurchaseDate;
    }

    public double getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(double PurchasePrice) {
        this.PurchasePrice = PurchasePrice;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public Portfolio getPortfolio() {
        return Portfolio;
    }

    public void setPortfolio(Portfolio Portfolio) {
        this.Portfolio = Portfolio;
    }
}

