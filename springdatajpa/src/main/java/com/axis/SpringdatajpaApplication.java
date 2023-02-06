package com.axis;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.axis.entity.Employee;
import com.axis.repository.EmployeeRepository;

@SpringBootApplication
public class SpringdatajpaApplication implements CommandLineRunner{
	
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee =new Employee();
		employee.setId(1);
		employee.setName("Shikhar");
		employee.setDept("hr");
		employee.setAge(21);
		employee.setSalary(66000);
		
		employeeRepository.save(employee);
		//save the employee
        Employee employee2 = new Employee(3, "manish", 45000, "tester", 24);
        employeeRepository.save(employee2);

        //get all employees
    List<Employee> employees = employeeRepository.findAll();
    for(Employee emp: employees)
        System.out.println(employee2.getId() +" "+ employee2.getName());


      //get employee by id
     Optional<Employee> emp=    employeeRepository.findById(1);
     if(emp.isPresent())
     {
         Employee e = emp.get();
         System.out.println(e.getId() +" "+ e.getName() +" "+ e.getAge() +" "+ emp.get().getDept());
     }
     else
         System.out.println("no employee found for the given id"); 
		// TODO Auto-generated method stub
		
	}
	

}
