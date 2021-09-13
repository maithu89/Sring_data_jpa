package com.example.springdatajda.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "tbl_employee")
public class Employee {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "first_name")
    private  String firstName;

    @Column(name = "last_name")
    private  String LastName;

    private  String email;
}
