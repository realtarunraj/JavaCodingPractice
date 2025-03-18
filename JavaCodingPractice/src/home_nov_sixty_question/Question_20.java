package home_nov_sixty_question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
	public int id;
	public String name;
	public String department;

	public Employee(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

	// Comparable method implementation ...
	@Override
	public int compareTo(Employee o) {
		return Integer.compare(this.id, o.id);
	}

	// Form here writing the methods for Comparators ...
	public static Comparator<Employee> sortByName = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name);
		}
	};

	public static Comparator<Employee> sortByDepartment = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.department.compareTo(o2.department);
		}
	};
}

public class Question_20 {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(7, "Mugdha", "CSE"));
		list.add(new Employee(10, "Shreyanka", "ECE"));
		list.add(new Employee(1, "Tarun", "ME"));
		list.add(new Employee(4, "Deepak", "CE"));

		// Sorting using comparable ...
		Collections.sort(list);
		// System.out.println(list);

		Collections.sort(list, Employee.sortByName);
		// System.out.println(list);

		Collections.sort(list, Employee.sortByDepartment);
		list.forEach(x -> System.out.println(x));
	}
}
