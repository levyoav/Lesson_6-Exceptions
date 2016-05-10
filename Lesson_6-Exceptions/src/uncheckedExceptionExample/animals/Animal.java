package uncheckedExceptionExample.animals;

import uncheckedExceptionExample.IllegalAnimalAgeException;



public class Animal {

	private int age;

	public int getAge() {
		return age;
	}

	//IllegalAnimalAgeException extends RuntimeException. Thus, it is not necessary to use
	//the 'throws' declaration  for this method.
	public void setAge(int age) throws IllegalAnimalAgeException {
		if (age >= 0) {
			this.age = age;
		} else {
			//Throws the exception if the age parameter is a negative number. 
			throw new IllegalAnimalAgeException("illegal age: " + age);
		}
	}

}
