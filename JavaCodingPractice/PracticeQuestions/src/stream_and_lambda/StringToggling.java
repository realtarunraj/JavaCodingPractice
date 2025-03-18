package stream_and_lambda;

public class StringToggling {
	public static void main(String[] args) {
		String str = "telCo";
		String answer = str.chars().mapToObj(x -> {
			char character = (char) (x);
			return Character.isUpperCase(character) ? Character.toLowerCase(character)
					: Character.toUpperCase(character);
		}).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();

		System.out.println(answer);
	}
}
