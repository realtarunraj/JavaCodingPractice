package eleven_twenty;

@FunctionalInterface
interface MyFunctionalInterface{
	
	//abstract method
	public abstract void abstractMethod();
	
	//default method
	default void defaultMethod() {
		System.out.println("Hello by defaultMethod of MyFunctionalInterface");
	}
}

class MyFunctionalInterfaceImpl implements MyFunctionalInterface{

	@Override
	public void abstractMethod() {
		System.out.println("Hello from abstract method of MyFunctionalInterfaceImpl");
	}
	
	@Override
	public void defaultMethod() {
		System.out.println("Hello from default method of MyFunctionalInterfaceImpl");
	}	
}

public class Question13 {
    public static void main(String[] args) {
    	
    	MyFunctionalInterfaceImpl obj = new MyFunctionalInterfaceImpl();
    	
    	//overriding abstract method ........
    	obj.abstractMethod();
    	
    	//overriding abstract method ......
    	obj.defaultMethod();
    }
}
