package twentyOne_thirty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private Double salary;

	public Employee(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	// Overriding by Comparable

	@Override
	public int compareTo(Employee other) {
		return Integer.compare(this.id, other.id);
	}

	// Comparator use ......

	public static Comparator<Employee> nameSorting = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}
	};

	public static Comparator<Employee> salarySorting = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getSalary().compareTo(o2.getSalary());
		}
	};

}

public class Question21 {
	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee(14, "Tarun", 90000.0));
		employee.add(new Employee(7, "Mugdha", 80000.0));
		employee.add(new Employee(62, "Deepak", 60000.0));
		employee.add(new Employee(34, "Shreyanka", 40000.0));

		// Using Comparable
		Collections.sort(employee);
		for (Employee emp : employee) {
			System.out.println(emp);
		}

		// Name Sorting Using Comparator
		Collections.sort(employee, Employee.nameSorting);
		for (Employee emp : employee) {
			System.out.println(emp);
		}

		// Salary Sorting using Comparator
		Collections.sort(employee, Employee.salarySorting);
		for (Employee emp : employee) {
			System.out.println(emp);
		}
	}
}