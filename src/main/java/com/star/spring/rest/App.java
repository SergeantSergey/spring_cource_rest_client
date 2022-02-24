package com.star.spring.rest;

import com.star.spring.rest.configuration.MyConfig;
import com.star.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

        List<Employee> allEmployees = communication.getAllEmployees();

        System.out.println(allEmployees);

        System.out.println("*-------------------------------------");

        Employee employee = communication.getEmployee(4);

        System.out.println(employee);

        System.out.println("*-------------------------------------");

//        Employee newEmployee = new Employee("Sveta", "Sokolova", "HR", 800);
//        communication.saveEmployee(newEmployee);

        System.out.println("*-------------------------------------");

//        newEmployee.setDepartment("IT");
//        newEmployee.setSurname("Briansk");
//
//        communication.saveEmployee(newEmployee);

        System.out.println("*-------------------------------------");

        communication.deleteEmployee(10);
    }
}
