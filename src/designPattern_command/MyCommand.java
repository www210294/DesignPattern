package designPattern_command;

public class MyCommand implements Command {
	private Receiver receiver;
	public MyCommand(Receiver reciever) {
		this.receiver = new Receiver();
	}
	public void exe() {
		receiver.action();
	}

}
