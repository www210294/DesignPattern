package designPattern_decorator;

public class Decorator implements Sourceable {
	Sourceable source;
	public Decorator(Sourceable source) {  //��紫������Ҫװ�εĶ���
		super();
		this.source = source;
	}
	public void method() { //��ԭ��source �ķ�����������
		System.out.println("before method");
		source.method();
		System.out.println("after method");
	}
	public static void main(String[] args) {
		Decorator decorator = new Decorator(new Source());
		decorator.method();
	}
}
