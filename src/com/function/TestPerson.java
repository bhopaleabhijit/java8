package com.function;

public class TestPerson {
public static void main(String[] args) {
	IPerson person = new IPerson() {
		
		@Override
		public void getName() {
			System.out.println("verbose code with anonymous class");
			
		}
	};
	person.getName();
	
	//With Lambda we can write same logic in concise way
	//Functional interface enbles functional programming
	
	
	IPerson  person1 =()->System.out.println("Concise code with lambda function");
	
	person1.getName();
}
}
