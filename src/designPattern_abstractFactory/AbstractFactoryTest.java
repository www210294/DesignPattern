package designPattern_abstractFactory;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		AbstractFactory af = new MailSenderFactory();
		Sender sender = af.produceSender();
		sender.send();
		af = new SmsSenderFactory();
		af.produceSender().send();
	}
}
