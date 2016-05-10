package runtimeExceptionsExamples;

import uncheckedExceptionExample.animals.Animal;
import uncheckedExceptionExample.animals.Cat;
import uncheckedExceptionExample.animals.Dog;

public class ClassCast {

	public static void main(String[] args) {

		Animal a = new Dog(); //'a' is an Animal type reference which is assigned to a Dog object.

		//The object referenced by 'a' (a Dog object) is casted as a Cat object to a Cat type reference 'c'. A Dog is
		//not a Cat, thus a  "java.lang.ClassCastException" will be thrown in this line. Need to check if 'a' is an instance
		//of Cat in order to be able to do the casting.
		Cat c = (Cat) a;
		System.out.println(c); //Won't get to this line.

	}

}
