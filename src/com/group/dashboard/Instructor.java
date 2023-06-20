package com.group.dashboard;

//Concrete observer representing the instructor
class Instructor implements Observer {
 private String name;
 
 public Instructor(String name) {
     this.name = name;
 }
 
 public void update(String message) {
     System.out.println(name + " received a new message: " + message);
 }
}
