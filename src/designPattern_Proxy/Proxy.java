package designPattern_Proxy;

public class Proxy implements Sourceable {
	Sourceable source;
	/*public Decorator(Sourceable source) {
		super();
		this.source = source;
	}*/
	public Proxy() { //ע���װ����ģʽ����
		super();
		this.source = new Source();
	}
	public void method() { //��ԭ��source �ķ�����������
		System.out.println("before method");
		source.method();
		System.out.println("after method");
	}
	public static void main(String[] args) {
		//Decorator decorator = new Decorator(new Source());
		Proxy decorator = new Proxy(); ////ע���װ����ģʽ����
		decorator.method();
	}
}
