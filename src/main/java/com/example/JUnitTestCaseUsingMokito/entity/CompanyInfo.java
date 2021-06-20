package com.example.JUnitTestCaseUsingMokito.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "company")
public class CompanyInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int c_id;

    private String c_name;
}
