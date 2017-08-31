package designPattern_abstractFactory;

public class SmsSenderFactory implements AbstractFactory {

	public Sender produceSender() {
		return new SmsSender();
	}

}
