package designPattern_ChainOfResposibility;

public class MyHandler extends AbstractHandler {
	private String name;
	public MyHandler(String name) {
		this.name = name;
	}
	public void operation() {
		System.out.println(name+" dead!");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(getHandler() != null) {
			getHandler().operation();
		}
	}
	public static void main(String[] args) {
		MyHandler myHandler1 = new MyHandler("first");
		MyHandler myHandler2 = new MyHandler("second");
		MyHandler myHandler3 = new MyHandler("third");
		myHandler1.setHandler(myHandler2);
		myHandler2.setHandler(myHandler3);
		myHandler3.setHandler(myHandler1);
		myHandler1.operation();
	}
}
