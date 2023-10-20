package twentyOne_thirty;

import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private String department;
	private Double salary;

	public Employee(int id, String name, String department, Double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee other) {
		return Integer.compare(this.id, other.id);
	}
}

public class Question29 {
	public static void main(String[] args) {
		Set<Employee> employeSet = new TreeSet<>();
		
		Employee e1 = new Employee(4, "Tarun", "Full Stack", 30000.00);
		Employee e2 = new Employee(8, "Deepak", "Full Stack", 30000.00);
		
		employeSet.add(e1);
		employeSet.add(e2);
		
		for(Employee emp : employeSet) {
			System.out.println(emp);
		}
	}

}
