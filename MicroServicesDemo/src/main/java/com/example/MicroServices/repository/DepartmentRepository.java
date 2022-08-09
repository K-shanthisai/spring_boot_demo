package com.example.MicroServices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MicroServices.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
