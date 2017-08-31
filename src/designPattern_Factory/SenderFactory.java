package designPattern_Factory;

public class SenderFactory {
	public static Sender produce(String type){
		Sender sender = null;
		if(type.equals("SMS")) {
			sender = new SmsSender();
		} else if(type.equals("Mail")) {
			sender = new MailSender();
		} else {
			System.out.println("please give a correct type of the sender!");
		}
		return sender;
	}
	public static Sender produceMailSender(){
		return new MailSender();
	}
	public static Sender produceSMSSender(){
		return new SmsSender();
	}
}
