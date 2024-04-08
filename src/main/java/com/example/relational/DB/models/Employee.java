package com.example.relational.DB.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    private int id ;

    @Column(nullable = false)
    private String firstName ;
    @Column(nullable = false)
    private String lsatName ;
    @Column(nullable = false , unique = true)
    private String email ;
    @Column(nullable = false)
    private LocalDate DOB ;
    @Column(nullable = false)
    private String role ;
    // one to one between the employee and address
    @OneToOne
    @JoinColumn(name = "address-id")
    private Address address ;
    @ManyToOne
    @JoinColumn(name = "department-id")
    private Department department ;
    @ManyToMany
    @JoinTable(
            name = "employee-mission",
            joinColumns = @JoinColumn(name = "employee-id"),
            inverseJoinColumns = @JoinColumn(name = "mission-id")
    )
    private List<Mission> missions ;
}
