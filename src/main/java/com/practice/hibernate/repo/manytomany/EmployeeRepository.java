package com.practice.hibernate.repo.manytomany;


import com.practice.hibernate.models.manytomany.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}