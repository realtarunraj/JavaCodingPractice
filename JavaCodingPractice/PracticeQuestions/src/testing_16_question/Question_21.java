package testing_16_question;

public class Question_21 {
	public static void main(String[] args) {
		String sentence = "This is a\nsentence\twith\nwords separated by\nspaces, new lines, and\ttabs.";
		
		String[] regex = sentence.split("[ \\t\\n]");
		System.out.println(regex.length);
	}
}
