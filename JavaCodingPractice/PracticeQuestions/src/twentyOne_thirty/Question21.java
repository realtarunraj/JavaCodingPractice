package twentyOne_thirty;

public class Question21{
	public static void main(String[] args) {
		
		String bySpace = "My name is Tarun Kumar Raj";
		String byTab = "I	am	Tarun	Raj";
		String lineChange = "my name \n is tarun \n raj";
		
		String[] stringBySpace = bySpace.split(" ");
		String[] stringByTab = byTab.split("\t");
		String[] stringLineChange = lineChange.split("\n");
		
		System.out.println(stringBySpace.length); // Output = 6
		System.out.println(stringByTab.length); //Output = 4
		System.out.println(stringLineChange.length); // Output = 3
	}
}