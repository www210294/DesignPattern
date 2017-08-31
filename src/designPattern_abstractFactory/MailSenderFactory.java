package designPattern_abstractFactory;

public class MailSenderFactory implements AbstractFactory {

	public  Sender produceSender() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
