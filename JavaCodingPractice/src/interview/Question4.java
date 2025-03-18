package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	String gender;
	String department;

	public Employee(int id, String name, String gender, String department) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.department = department;
	}
}

public class Question4 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Tarun", "male", "engineering");
		Employee emp2 = new Employee(2, "Aman", "male", "finance");
		Employee emp3 = new Employee(3, "Bob", "male", "engineering");
		Employee emp4 = new Employee(4, "Charlie", "male", "finance");
		Employee emp5 = new Employee(5, "David", "male", "engineering");
		Employee emp6 = new Employee(6, "Eva", "female", "finance");
		Employee emp7 = new Employee(7, "Frank", "male", "engineering");
		Employee emp8 = new Employee(8, "Grace", "female", "finance");
		Employee emp9 = new Employee(9, "Hannah", "female", "engineering");
		Employee emp10 = new Employee(10, "Ivy", "female", "finance");

		List<Employee> listEmployee = new ArrayList<>();
		listEmployee.addAll(List.of(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10));

		// Getting the count of employee gender wise ...
		Map<String, Long> mapGender = listEmployee.stream()
				.collect(Collectors.groupingBy(emp -> emp.gender, Collectors.counting()));

		System.out.println("--------- Counting according to gender ---------");
		mapGender.forEach((gender, count) -> System.out.println(gender + " : " + count));

		System.out.println();

		// Getting the gender count Departments wise .....
		Map<String, Map<String, Long>> departmentWiseGEnderCount = listEmployee.stream().collect(Collectors
				.groupingBy(emp -> emp.department, Collectors.groupingBy(emp -> emp.gender, Collectors.counting())));

		System.out.println("--------- Counting of gender according to department ---------");
		departmentWiseGEnderCount.forEach((department, genderMap) -> {
			System.out.println("Depertment : " + department);
			genderMap.forEach((gender, count) -> System.out.println(gender + " : " + count));
		});
	}
}
