package br.com.solid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.solid.pru.Driver;
import br.com.solid.pru.Employee;

@SpringBootApplication
public class SolidApplication {

	public static void main(String[] args) {
		
		Employee emp = new Driver();
		printEmployee(new Driver());
		
		SpringApplication.run(SolidApplication.class, args);
	}

	private static void printEmployee(Employee emp) {
		
		if(emp instanceof Driver){
			Driver driver = (Driver) emp;
			driver.drive();
		}
		
	}

}
