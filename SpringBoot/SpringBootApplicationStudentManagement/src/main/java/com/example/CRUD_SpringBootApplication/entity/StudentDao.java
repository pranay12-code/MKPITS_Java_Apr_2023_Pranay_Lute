package com.example.CRUD_SpringBootApplication.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Integer> {
}