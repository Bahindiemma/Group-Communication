package com.group.dashboard;

public class GroupCommunication {

	public GroupCommunication() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Create the discussion dashboard
		DiscussionDashboard dashboard = new DiscussionDashboard();

		// Create students (observers)
		Student student1 = new Student("Alice");
		Student student2 = new Student("Bob");
		Student student3 = new Student("Charlie");

		// Create instructor (observer)
		Instructor instructor = new Instructor("Prof. Smith");

		// Register students and instructor as observers
		dashboard.registerObserver(student1);
		dashboard.registerObserver(student2);
		dashboard.registerObserver(student3);
		dashboard.registerObserver(instructor);

		// Post a new message on the dashboard
		dashboard.postMessage("Let's discuss the homework assignment!");

		// Unregister a student as an observer
		dashboard.unregisterObserver(student2);

		// Post another message
		dashboard.postMessage("Reminder: The quiz is next week.");
	}

}
