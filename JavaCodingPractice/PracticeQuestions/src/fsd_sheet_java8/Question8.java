package fsd_sheet_java8;

public class Question8 {
	public static void main(String[] args) {
		String str = "bottle";

		System.out.println(str.chars().mapToObj(x -> (char) x).filter(x -> str.indexOf(x) != str.lastIndexOf(x))
				.distinct().findFirst().get());
	}
}
