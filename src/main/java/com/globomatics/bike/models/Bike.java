package com.globomatics.bike.models;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Bike {
    private String name;
    private String email;
    private String phone;
    private String model;
    private String serialNumber;
    private BigDecimal purchasePrice;
    private Date purchaseDate;
    private boolean contact;
}
