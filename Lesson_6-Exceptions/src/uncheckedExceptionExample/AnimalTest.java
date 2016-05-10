package uncheckedExceptionExample;

import uncheckedExceptionExample.animals.Animal;



public class AnimalTest {

	public static void main(String[] args) {

		Animal a = new Animal();

		try {
			//Catches IllegalAnimalAgeException. Since this exception extends RuntimeException, it is not
			//necessary to enclose the setAge() method in try/catch block. But by enclosing it, it allows to handle the exception
			//and let main continue to run after the exception is handled rather than throw it from main and terminating it.
			a.setAge(-8);
		} catch (IllegalAnimalAgeException e) {
			e.printStackTrace(System.out);
		}

		System.out.println("animal age: " + a.getAge()); //0 is printed as the default value.
	}
}
