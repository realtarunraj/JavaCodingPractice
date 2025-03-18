/**
 * Write a program to create POJO class of Product (Product Id, ProductName)
 * and Store all values in any collection
 * and Sort that values by ProductName in ascending order
 */

package testing_10_question;

class Product {
	private int id;
	private String name;

	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
}

public class SortingPojoClass {
	public static void main(String[] args) {

	}
}
