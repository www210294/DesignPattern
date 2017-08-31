package designPattern_adapter;

public class InterfaceAdapter extends AbstractTarget  { //�̳��˳�����Ϳ��Բ���ȥʵ��ԭ�ӿ������еķ���
	
	@Override
	public void method1() {
		System.out.println("InterfaceAdapter only overwrite method1 which is inherited from interface in abstractTarget");
	}
	
	public static void main(String[] args) {
		InterfaceAdapter interfaceAdapter = new InterfaceAdapter();
		interfaceAdapter.method1();
	}
}
