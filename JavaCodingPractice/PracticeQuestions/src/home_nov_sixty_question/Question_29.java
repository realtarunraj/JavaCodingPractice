package home_nov_sixty_question;

import java.util.TreeSet;

class EmployeeData implements Comparable<EmployeeData> {
	int id;
	String name;
	String department;

	public EmployeeData(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	@Override
	public int compareTo(EmployeeData o) {
		return Integer.compare(this.id, o.id);
	}

	@Override
	public String toString() {
		return "EmployeeData [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

}

public class Question_29 {
	public static void main(String[] args) {
		TreeSet<EmployeeData> treeSet = new TreeSet<>();
		treeSet.add(new EmployeeData(1, "Tarun", "Software"));
		treeSet.add(new EmployeeData(10, "Abhimanyu", "IT"));

		System.out.println(treeSet);
	}
}
