package designPattern_adapter;

public class ClassAdapter extends Source implements Targetable {
	
	public void method2() {
		System.out.println("This is the Targetable method!");
	}
	public static void main(String[] args) {
		ClassAdapter ca = new ClassAdapter();
		ca.method1();
		ca.method2();
	}
}
