package com.restController;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Service.EmployeeeService;
import com.model.Employee;

@RestController
public class EmployeeRestController {

	@Autowired
	EmployeeeService service;

	//@RequestMapping(value = "/getAll/json", produces = "application/json", method = RequestMethod.GET)
	@GetMapping("/getAll/json")
	public @ResponseBody List<Employee> getEmp() {
		return service.getAll();
	}

//	@RequestMapping(value = "save/json", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	
	@PostMapping("save/json")
	public @ResponseBody String save(@RequestBody Employee employee) {
		service.save(employee);

		return "saved Sucessfully...";
	}

	//@RequestMapping(value = "/getById/json/{id}", produces = "application/json", consumes = "application/json", method = RequestMethod.GET)

	@GetMapping("/getById/json/{id}")
	public @ResponseBody Employee getbyId(@PathVariable Integer id) {

		return service.getByID(id);

	}

	//@RequestMapping(value = "/deleteById/json/{id}", method = RequestMethod.DELETE, produces = "application/json", consumes = "application/json")
	@DeleteMapping("/deleteEmp")
	public @ResponseBody String DeleteByID(@PathVariable Integer id) {

		service.delete(id);
		return "1 Record Deleted Sucessfully...!";

	}
	
	
	@PutMapping("update")
	public @ResponseBody String upadate(@RequestBody Employee employee) {

		service.updateById(employee);
		return "1 Record Updated Sucessfully...!";

	}

}