package com.codeclan.example.employeetracking;
import com.codeclan.example.employeetracking.models.Employee;
import com.codeclan.example.employeetracking.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeetrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canSaveEmployee() {
		Employee rachel = new Employee("Rachel Smith", 37, 765938, "rachel.smith@email.com");
		Employee leo = new Employee("Leo Tall", 30, 988544, "leo.tall@email.com");
		Employee cameron = new Employee("Cameron Green", 42, 665832, "cameron.green@email.com");
		employeeRepository.save(rachel);
		employeeRepository.save(leo);
		employeeRepository.save(cameron);
	}

}
