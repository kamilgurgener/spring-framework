package com.cydeo.entity;

import com.cydeo.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "students") //Changes Table name
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "studentFirstName") //changes column name
    private String firstName;
    @Column(name = "studentLastName")
    private String lastName;
    private String email;

    @Transient  //Does not bring Table Name
    private String city;


    @Column(columnDefinition = "DATE")
    private LocalDate birthDate;

    @Column(columnDefinition = "TIME")
    private LocalTime birthTime;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}