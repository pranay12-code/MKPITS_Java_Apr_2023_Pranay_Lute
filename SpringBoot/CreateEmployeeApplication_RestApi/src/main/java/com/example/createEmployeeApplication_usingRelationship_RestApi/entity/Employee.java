package com.example.createEmployeeApplication_usingRelationship_RestApi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    private int employee_id;
    private String name ;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Employee() {
    }

    public Employee(int employee_id, String name, Address address) {
        this.employee_id = employee_id;
        this.name = name;
        this.address = address;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
