package com.docker.jenikin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docker.jenikin.entity.Employee;
@Repository
public interface EmployeRepository extends JpaRepository<Employee, Integer>{

}
