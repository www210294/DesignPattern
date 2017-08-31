package designPattern_observer;


public class Mysubject extends AbstractSubject {
	public void operation() {
		System.out.println("This is the operation of Mysubject!");
		notifyObservers();
	}
	public static void main(String[] args) {
		Subject subject = new Mysubject();
		subject.add(new Observer1());
		subject.add(new Observer2());
		subject.operation();
	}
}
