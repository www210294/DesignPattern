package designPattern_Factory;

public class FactoryTest {

	public static void main(String[] args) {
		SenderFactory.produce("SMS").send();
		SenderFactory.produceMailSender().send(); //避免非法的传人参数，
		SenderFactory.produceSMSSender().send();
	}

}
