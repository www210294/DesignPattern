package designPattern_Mediator;

public class User2 extends User{ //User1 和User2 并不持有对方引用，但两者的继承了来自父类的Mediator
	public User2(Mediator mediator) {
		super(mediator);
	}
	@Override
	public void work() {
		System.out.println("user2 executing!!");
	}
}
