package designPattern_Proxy;

public class Proxy implements Sourceable {
	Sourceable source;
	/*public Decorator(Sourceable source) {
		super();
		this.source = source;
	}*/
	public Proxy() { //注意和装饰器模式区别
		super();
		this.source = new Source();
	}
	public void method() { //对原有source 的方法进行修饰
		System.out.println("before method");
		source.method();
		System.out.println("after method");
	}
	public static void main(String[] args) {
		//Decorator decorator = new Decorator(new Source());
		Proxy decorator = new Proxy(); ////注意和装饰器模式区别
		decorator.method();
	}
}
