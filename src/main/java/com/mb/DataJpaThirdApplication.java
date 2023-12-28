package com.mb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mb.service.EmployeeService;

@SpringBootApplication
public class DataJpaThirdApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(DataJpaThirdApplication.class, args);
		EmployeeService service = context.getBean(EmployeeService.class);
//		service.getEmps("empName");
//		service.getEmpsWithPagination(3, 2);
		service.getEmpsByQBE();
	}

}
