package com.javaex.oop.casting;

public class CastingEx {

	public static void main(String[] args) {
		Dog dog1 = new Dog("멍멍이");
		dog1.eat();
		dog1.walk();
		dog1.bark();
		
		Animal dog2 = new Dog("스누피");
		dog2.eat();
		dog2.walk();
		
		((Dog)dog2).bark();
		
		Animal pet = new Dog("아지");
		pet.eat();
		pet.walk();
		
		pet = null;
		
		pet = new Cat("야옹");
		pet.eat();
		pet.walk();
		
		if (pet instanceof Dog)
		{
			((Dog)pet).bark();
		}
		else if(pet instanceof Cat) {
			((Cat)pet).meow();
		}
	}

}
