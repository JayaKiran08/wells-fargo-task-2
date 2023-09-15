package com.wellsfargo.counselor.entity;



import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Portfolio_ID;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date CreationDate;

    @OneToOne(mappedBy = "Portfolio")
    private Client client;

    protected Portfolio() {}

    public Portfolio(Client client) {
        this.client = client;
        this.CreationDate = new Date();
    }

    public Long getPortfolio_Id() {
        return Portfolio_ID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getCreationDate() {
        return CreationDate;
    }
}

