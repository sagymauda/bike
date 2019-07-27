package com.globomatics.bike.models;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Bike {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private String model;
    private String serialNumber;
    private Integer purchsePrice;
    private Date PurchseDate;
    private boolean contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getPurchsePrice() {
        return purchsePrice;
    }

    public void setPurchsePrice(Integer purchsePrice) {
        this.purchsePrice = purchsePrice;
    }

    public Date getPurchseDate() {
        return PurchseDate;
    }

    public void setPurchseDate(Date purchseDate) {
        PurchseDate = purchseDate;
    }

    public boolean isContact() {
        return contact;
    }

    public void setContact(boolean contact) {
        this.contact = contact;
    }

    public Bike(){}

    public Bike( String name, String email, String phone, String model, String serialNumber, Integer purchsePrice, Date purchseDate, boolean contact) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.model = model;
        this.serialNumber = serialNumber;
        this.purchsePrice = purchsePrice;
        PurchseDate = purchseDate;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", purchsePrice=" + purchsePrice +
                ", PurchseDate=" + PurchseDate +
                ", contact=" + contact +
                '}';
    }
}

