package home_nov_sixty_question;

@FunctionalInterface
interface MyFunctionalInterface {

	// Since it is functional Interface it should have one abstract method
	public abstract void abstractMethod();

	default void defaultMethod() {
		System.out.println("Hello form default method.");
	}
}

class FunctionalInterfaceImpl implements MyFunctionalInterface {

	public void abstractMethod() {
		System.out.println("Hello abstract form the Impl class");
	}

	public void defaultMethod() {
		System.out.println("Hello default method form Impl class");
	}
}

public class Question_13 {
	public static void main(String[] args) {
		FunctionalInterfaceImpl functional = new FunctionalInterfaceImpl();

		functional.abstractMethod();
		functional.defaultMethod();
	}
}
