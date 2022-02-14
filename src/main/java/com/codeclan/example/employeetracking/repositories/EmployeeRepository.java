package com.codeclan.example.employeetracking.repositories;
import com.codeclan.example.employeetracking.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// A repository for doing database operations
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
