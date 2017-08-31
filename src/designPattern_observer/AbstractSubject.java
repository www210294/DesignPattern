package designPattern_observer;

import java.util.Enumeration;
import java.util.Vector;

import designPattern_observer.Observer;
import designPattern_observer.Subject;

public abstract class AbstractSubject implements Subject {
	private Vector<Observer> vector = new Vector<Observer>();
	
	public void add(Observer observer) {
		vector.add(observer);
	}

	public void del(Observer observer) {
		vector.remove(observer);
	}


	public void notifyObservers() {
		Enumeration<Observer> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			enumeration.nextElement().update();
		}
	}

}
