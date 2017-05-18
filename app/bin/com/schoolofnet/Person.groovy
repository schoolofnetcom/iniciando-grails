package com.schoolofnet

class Person {
	
	String firstName;
	String lastName;
	int age;

    static constraints = {
    	firstName blank: false
    	age min:15
    }
}
