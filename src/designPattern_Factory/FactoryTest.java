package designPattern_Factory;

public class FactoryTest {

	public static void main(String[] args) {
		SenderFactory.produce("SMS").send();
		SenderFactory.produceMailSender().send(); //����Ƿ��Ĵ��˲�����
		SenderFactory.produceSMSSender().send();
	}

}
