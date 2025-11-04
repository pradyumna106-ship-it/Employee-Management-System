package crud.employee.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import crud.employee.entity.Employee;
import crud.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@PostMapping("/create")
	public void createNewEmployee(@ModelAttribute Employee emp) {
		service.createNewEmployee(emp);
	}
	@GetMapping("/deleteAll")
	public void deleteAllEmployee() {
		service.deleteAllEmployee();
	}
	@PostMapping("/update")
	public void updateEmployee(@ModelAttribute Employee emp) {
		service.updateEmployee(emp);
	}
	@GetMapping("/delete")
	public void deleteEmployee(Long id) {
		service.deleteEmployee(id);
	}
	@GetMapping("/search")
	public String searchEmployee(Long id, Model model) {
		Employee emp = service.searchEmployee(id);
		System.out.println(emp);
		model.addAttribute("empObj", emp);
		return "searchResult";
	}
	@GetMapping("/viewAll")
	public String getAllEmployee(Model model) {
		List<Employee> empList = service.getAllEmployees();
		System.out.println(empList);
		model.addAttribute("empList", empList);
		return "viewAll";
	}
	@GetMapping("/createPage")
	public String createPage() {
		return "create";
	}
	
	@GetMapping("/updatePage")
	public String updatePage() {
		return "update";
	}
	
	@GetMapping("/deletePage")
	public String deletePage() {
		return "delete";
	}
	@GetMapping("/searchPage")
	public String searchPage() {
		return "search";
	}
	
	@GetMapping("/deleteAllPage")
	public String deleteAllPage() {
		return "deleteAll";
	}
}
