package crud.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.employee.entity.Employee;
import crud.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
	@Autowired
	EmployeeRepository repo;
	
	public void createNewEmployee(Employee emp) {
		repo.save(emp);
	}
	public void updateEmployee(Employee emp) {
		repo.save(emp);
	}
	public void deleteEmployee(Long id) {
		repo.deleteById(id);
	}
	public void deleteAllEmployee() {
		repo.deleteAll();
	}
	public Employee searchEmployee(Long id) {
		return repo.findById(id).get();
	}
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
