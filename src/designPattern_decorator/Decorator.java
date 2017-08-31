package designPattern_decorator;

public class Decorator implements Sourceable {
	Sourceable source;
	public Decorator(Sourceable source) {  //外界传进来需要装饰的对象
		super();
		this.source = source;
	}
	public void method() { //对原有source 的方法进行修饰
		System.out.println("before method");
		source.method();
		System.out.println("after method");
	}
	public static void main(String[] args) {
		Decorator decorator = new Decorator(new Source());
		decorator.method();
	}
}
