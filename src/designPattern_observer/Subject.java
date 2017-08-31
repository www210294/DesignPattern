package designPattern_observer;

public interface Subject {
	public void add(Observer observer);
	public void del(Observer observer);
	public void operation();
	public void notifyObservers();
}
