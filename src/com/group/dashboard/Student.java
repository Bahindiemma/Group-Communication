package com.group.dashboard;

//Concrete observer representing a student in the class
public class Student implements Observer {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	public void update(String message) {
		System.out.println(name + " received a new message: " + message);
	}
}