package com.example.relational.DB.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="department")
public class Department {
    @Id
    @GeneratedValue
    private int id ;
    @Column(name = "departmentName")
    private String name ;
    @OneToMany(mappedBy = "department")
    private List<Employee> employees ;
}
