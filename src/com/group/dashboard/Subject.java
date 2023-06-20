package com.group.dashboard;

//Subject interface that defines the methods for managing observers
interface Subject {
 void registerObserver(Observer observer);
 void unregisterObserver(Observer observer);
 void notifyObservers(String message);
}