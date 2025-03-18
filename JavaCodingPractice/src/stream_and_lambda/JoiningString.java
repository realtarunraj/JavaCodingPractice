package stream_and_lambda;

import java.util.StringJoiner;

///*
// * String Joiner :-
// * 
// * A StringJoiner in Java helps to join multiple strings 
// * with a specified delimiter (like a comma or space).
// * You can also add optional prefix and suffix to the final joined string.
// * It's useful for creating formatted output from a list of strings.
// * 
// * */
public class JoiningString {
	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(", ");
		joiner.add("Tarun");
		joiner.add("Mugdha");
		joiner.add("Shreyanka");
		joiner.add("Deepak");
		joiner.add("Rahul");
		joiner.add("Nirnoy");

		System.out.println(joiner.toString());

	}
}
