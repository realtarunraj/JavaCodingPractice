package eleven_twenty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>{

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
	public int compareTo(Employee other) {
		// Compare employee based on their Id ...
		return Integer.compare(this.id, other.id);
	}
	
	public static Comparator<Employee> NameEmployee = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}
	};
	
	public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getSalary().compareTo(o2.getSalary());
		}
	};
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class Question20 {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(7, "Mugdha", 40000.0));
		list.add(new Employee(10, "Shreyanka", 30000.0));
		list.add(new Employee(1, "Tarun", 60000.0));
		list.add(new Employee(4, "Deepak", 50000.0));
		
		System.out.println("Sorting by Id ......");
		Collections.sort(list); // Collections.sort(list) is for Comparable.
		for(Employee emp: list) {
			System.out.println(emp);
		}
		
		System.out.println("Sorting by Name ......");
		Collections.sort(list, Employee.NameEmployee); // Collections.sort(list, Comparator).
		for(Employee emp : list) {
			System.out.println(emp);
		}
		
		System.out.println("Sorting By Salary .........");
		Collections.sort(list, Employee.salaryComparator);
		for(Employee emp : list) {
			System.out.println(emp);
		}
	}
}
