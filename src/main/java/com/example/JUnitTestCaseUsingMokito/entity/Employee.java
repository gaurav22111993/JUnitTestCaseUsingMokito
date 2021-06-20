package com.example.JUnitTestCaseUsingMokito.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String designation;
    private int salary;

    @OneToOne(targetEntity = CompanyInfo.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cp_id", referencedColumnName = "c_id")
    private CompanyInfo companyInfo;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
