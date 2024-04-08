package com.example.relational.DB.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "mission")
public class Mission {
    @Id
    @GeneratedValue
    private int id ;
    private String name ;
    private int period ;
    @ManyToMany(mappedBy = "missions")
    private List<Employee> employees ;
}
