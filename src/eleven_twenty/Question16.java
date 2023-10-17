package eleven_twenty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product{
	
	private int id;
	private String name;

	public Product(int id, String name) {
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
	
	public static Comparator<Product> nameComparator = new Comparator<Product>() {
		
		@Override
		public int compare(Product o1, Product o2) {
			return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
		}
	};
	
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name;
	}
}

public class Question16 {
	
	public static void main(String[] args) {
		
		List<Product> listOfProduct = new ArrayList<>();
		Product p1 = new Product(1, "mango");
		Product p2 = new Product(2, "apple");
		listOfProduct.add(p1);
		listOfProduct.add(p2);
		listOfProduct.add(new Product(3, "Banana"));
		
		System.out.println("List of Product ....");
		for(Product p : listOfProduct) {
			System.out.println(p);
		}
		
		System.out.println("Products sorted in ascending Order ......");
		Collections.sort(listOfProduct, Product.nameComparator);
		for(Product p : listOfProduct) {
			System.out.println(p);
		}
		
	}
}
