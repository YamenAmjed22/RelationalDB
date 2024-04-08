package com.example.relational.DB.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue
    private int id ;
    private String street ;
    private String houseNumber ;
    private String zipCode ;
    // one to one between the employee and address
    @OneToOne
    @JoinColumn(name = "employee-id")
    private  Employee employee ;
}
