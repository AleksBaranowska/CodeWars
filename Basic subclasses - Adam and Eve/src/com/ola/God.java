package com.ola;

/**
 * According to the creation myths of the Abrahamic religions, Adam and Eve were
 * the first Humans to wander the Earth. You have to do God's job. The creation
 * method must return an array of length 2 containing objects (representing Adam
 * and Eve). The first object in the array should be an instance of the class
 * Man. The second should be an instance of the class Woman. Both objects have
 * to be subclasses of Human. Your job is to implement the Human, Man and Woman
 * classes.
 */
public class God {

	public static Human[] create() {
		Human[] ar = new Human[] { new Man(), new Woman() };
		return ar;
	}
}

class Human extends God {
	public Human() {
	}
}

class Woman extends Human {
	public Woman() {
	}
}

class Man extends Human {
	public Man(Man man) {
	}

	public Man() {
	}
}
