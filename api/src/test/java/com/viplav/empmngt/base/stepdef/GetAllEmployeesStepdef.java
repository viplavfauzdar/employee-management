package com.viplav.empmngt.base.stepdef;

import com.viplav.empmngt.EmpmngtApplication;
import com.viplav.empmngt.controller.EmployeeController;
import com.viplav.empmngt.model.Employee;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

//@CucumberContextConfiguration
//@SpringBootTest(classes =  EmpmngtApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@WebMvcTest(GetAllEmployeesStepdef.class)
public class GetAllEmployeesStepdef {

    //@Autowired
    //RestTemplate restTemplate;

    //@Autowired
    //EmployeeController employeeController;

    List<Employee> employees;

    @Given("^employee records exist$")
    public void employee_records_exist(){
        //WireMockServer wireMockServer = new WireMockServer(options().dynamicPort());
        RestTemplate restTemplate = new RestTemplate();
        employees = restTemplate.getForObject("http://localhost:8080/v1/api/employees", List.class);
        assertNotNull(employees);
    }

    @When("^all employees are requested$")
    public List<Employee> all_employees_are_requested(){
        return employees;
    }

    @Then("^return all employees$")
    public void return_all_employees(){

    }

}
