package srp2;

import java.time.LocalDate;

public class Employee {
	
	private String employeeId;
	private String name;
	private LocalDate dateOfJoining;
	private Double salaries;
	
	public Employee(String employeeId, String name, LocalDate dateOfJoining, Double salaries) {
		this.employeeId = employeeId;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
		this.salaries = salaries;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public Double getSalaries() {
		return salaries;
	}
	public void setSalaries(Double salaries) {
		this.salaries = salaries;
	}
}