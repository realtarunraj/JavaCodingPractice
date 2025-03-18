package java8_intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private Double salary;
	private String department;

	public Employee(int id, String name, Double salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
}

public class FilterEmployee {
	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee(17, "Aman", 49000.00, "IT"));
		employee.add(new Employee(3, "Tarun", 40000.00, "Software"));
		employee.add(new Employee(51, "Shreyanka", 92000.00, "IT"));
		employee.add(new Employee(48, "Deepak", 66000.00, "IT"));
		employee.add(new Employee(39, "Mugdha", 53000.00, "Deployment"));

		List<Employee> result = employee.stream().filter(x -> (x.getSalary() > 50000.0))
				.collect(Collectors.toList());

		result.forEach(x -> System.out.println(x.getName()));

	}
}
