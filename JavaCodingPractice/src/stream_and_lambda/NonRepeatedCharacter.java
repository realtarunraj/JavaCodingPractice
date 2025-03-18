package stream_and_lambda;

public class NonRepeatedCharacter {
	public static void main(String[] args) {
		String input = "Java Hungry Blog Alive is Awesome";
		input.chars().mapToObj(x -> (char) x).filter(x -> input.indexOf(x) == input.lastIndexOf(x)).findFirst()
				.ifPresent(System.out::print);
	}
}
