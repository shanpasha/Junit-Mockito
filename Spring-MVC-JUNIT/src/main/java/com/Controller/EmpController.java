package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Service.EmployeeeService;
import com.model.Employee;


@Controller
public class EmpController {
	
	@Autowired
EmployeeeService serv;	
	
	
	@RequestMapping("/AddEmp")
public String AddEmp () {
	return "AddEmployee";
	
	
}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(Employee employee ,Model model) {
		
		serv.save(employee );
		String msg="Employee Added Sucessfully...!";
		model.addAttribute("msg",msg);
		return "redirect:/home";
	}

	@RequestMapping("/getAll")
	public ModelAndView getAll(){
		
		return new ModelAndView ("getAll","employees",serv.getAll()) ;
		
	}
	@RequestMapping("/updateEmp")
	public String getbyid(@RequestParam("id")Integer id ,Model model) {
		Employee em=serv.getByID(id);
		model.addAttribute("Employee",em);
		return "Update";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String update(Employee employee) {
		serv.updateById(employee);
		String msg="updated Sucessfully...!";

		
		return "redirect:/getAll";
	
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam("id")Integer id) {
		
		serv.delete(id);
		return "redirect:/getAll";
		
		
	}
}
