package designPattern_Mediator;

public class User2 extends User{ //User1 ��User2 �������жԷ����ã������ߵļ̳������Ը����Mediator
	public User2(Mediator mediator) {
		super(mediator);
	}
	@Override
	public void work() {
		System.out.println("user2 executing!!");
	}
}
