package home_nov_sixty_question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
	int id;
	String name;

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static Comparator<Product> sortByName = new Comparator<Product>() {

		@Override
		public int compare(Product o1, Product o2) {
			return o1.name.compareTo(o2.name);
		}
	};
}

public class Question_16 {
	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();

		products.add(new Product(1, "Apple"));
		products.add(new Product(2, "Bat"));
		products.add(new Product(3, "Chair"));
		products.add(new Product(4, "Desk"));
		products.add(new Product(5, "Eggplant"));
		products.add(new Product(6, "Fan"));
		products.add(new Product(7, "Guitar"));
		products.add(new Product(8, "Helmet"));
		products.add(new Product(9, "Iron"));
		products.add(new Product(10, "Jacket"));
		products.add(new Product(11, "Kite"));
		products.add(new Product(12, "Lamp"));
		products.add(new Product(13, "Mouse"));
		products.add(new Product(14, "Notebook"));
		products.add(new Product(15, "Oven"));

		Collections.sort(products, Product.sortByName);
		products.forEach(x -> System.out.println(x.name));
	}
}
