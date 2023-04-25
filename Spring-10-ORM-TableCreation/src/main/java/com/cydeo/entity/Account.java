package com.cydeo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.math.BigDecimal;

@MappedSuperclass // Parent class. Extended classes gets Class fields.
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generates ID
    private Long id;
    private String owner;
    private BigDecimal balance;
    private BigDecimal interestRate;
}
