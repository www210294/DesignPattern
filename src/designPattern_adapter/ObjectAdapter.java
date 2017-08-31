package designPattern_adapter;

public class ObjectAdapter implements Targetable{
	private Source source;
	public ObjectAdapter(Source source) {
		super();
		this.source = source;
	}
	public void method1() {
		source.method1();
	}
	public void method2() {
		System.out.println("This is the targetable method!");
	}
	public static void main(String[] args) {
		ObjectAdapter objectAdapter = new ObjectAdapter(new Source());
		objectAdapter.method1();
		objectAdapter.method2();
	}
}
