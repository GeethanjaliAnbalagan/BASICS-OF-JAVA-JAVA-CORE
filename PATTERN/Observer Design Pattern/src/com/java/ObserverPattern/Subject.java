package com.java.ObserverPattern;

interface Subject {
	  void register(Observer obj);
	  void unregister(Observer obj);
	  void notifyObservers();
	}
