package com.group.dashboard;

import java.util.ArrayList;
import java.util.List;

//Concrete subject representing the class discussion dashboard
public class DiscussionDashboard implements Subject {
 private List<Observer> observers;
 
 public DiscussionDashboard() {
     observers = new ArrayList<>();
 }
 
 public void registerObserver(Observer observer) {
     observers.add(observer);
 }
 
 public void unregisterObserver(Observer observer) {
     observers.remove(observer);
 }
 
 public void notifyObservers(String message) {
     for (Observer observer : observers) {
         observer.update(message);
     }
 }
 
 public void postMessage(String message) {
     System.out.println("New message posted: " + message);
     notifyObservers(message);
 }
}
