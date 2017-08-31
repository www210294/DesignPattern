package designPattern_builder;

import java.util.ArrayList;
import java.util.List;

import designPattern_Factory.MailSender;
import designPattern_Factory.Sender;
import designPattern_Factory.SmsSender;

public class Builder {
	private List<Sender> list = new ArrayList<Sender>();
	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			Sender sender = new MailSender();
			sender.send();
			list.add(sender);
		}
	}
	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			Sender sender = new SmsSender();
			sender.send();
			list.add(sender);
		}
	}
	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
	}
}
