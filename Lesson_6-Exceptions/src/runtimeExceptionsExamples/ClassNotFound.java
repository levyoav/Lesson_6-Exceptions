package runtimeExceptionsExamples;

public class ClassNotFound {

	public static void main(String[] args) {

		//There is no class names "AnimalA" in the "uncheckedExceptionExample.animals" package. This will cause an exception. 
		String name = "uncheckedExceptionExample.animals.AnimalA";
//		name = "uncheckedExceptionExample.animals.Animal"; //Uncomment this line for not causing an exception.

		//Option 1 - The try/catch block is enclosing the method doForName1() that throws ClassNotFoundException.
		try {
			doForName1(name); //ClassNotFoundException is thrown from within the method doForName1() if name = "classes.AnimalA".
			System.out.println("Option 1 success"); //Printed if no exception is thrown.
		} catch (ClassNotFoundException e) {
			System.out.println("Option 1 error");
		}
		System.out.println("End of option 1");

		//Option 2 - The try/catch block is in the doForName2() method. 
		doForName2(name);
		System.out.println("End of option 2");
	}

	//Option 1 - The doForName1() method THROWS a ClassNotFoundException to the try/catch block of option 1 in main.
	public static void doForName1(String name) throws ClassNotFoundException {
		//Returns a class object associated with the class or interface with the name 'name'. If no such class exists a ClassNotFoundException
		//is thrown. The 'name' should be the name of the class with the relative package path. 
		Class.forName(name);

		//Printed if no exception is thrown.
		System.out.println("Option 1 success");
		System.out.println("End of doForName1()");
	}

	//Option 2 - The doForName2() method CATCHES a ClassNotFoundException and handles it in the method's body and returns to main at the end of the method.
	public static void doForName2(String name) {
		try {
			Class.forName(name);
			System.out.println("Option 2 success"); //Printed if no exception is thrown.
		} catch (ClassNotFoundException e) {
			System.out.println("Option 2 error");
		}

		System.out.println("End of doForName2()"); //Printed anyway since if an exception is thrown it is already caught and handled above. 
	}

}
