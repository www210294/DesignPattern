package designPattern_Mediator;

public class User1 extends User{ //User1 ��User2 �������жԷ����ã������ߵļ̳������Ը����Mediator
	public User1(Mediator mediator) {
		super(mediator);
	}
	@Override
	public void work() {
		System.out.println("user1 executing!!");
	}
}
