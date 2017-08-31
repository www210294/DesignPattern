package designPattern_adapter;

public class InterfaceAdapter extends AbstractTarget  { //继承了抽象类就可以不用去实现原接口中所有的方法
	
	@Override
	public void method1() {
		System.out.println("InterfaceAdapter only overwrite method1 which is inherited from interface in abstractTarget");
	}
	
	public static void main(String[] args) {
		InterfaceAdapter interfaceAdapter = new InterfaceAdapter();
		interfaceAdapter.method1();
	}
}
