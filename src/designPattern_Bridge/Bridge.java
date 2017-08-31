package designPattern_Bridge;

public class Bridge {
	private Sourceable source;
	public Sourceable getSource() {
		return source;
	}
	public void setSource(Sourceable source) { // decoratorģʽû��set��get, ������Bridge û��ʵ���ڲ�ҵ��ӿ�
		this.source = source;
	}
	public void method() {
		source.method();
	}
	public static void main(String[] args) {
		Bridge bridge = new Bridge();
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();
		bridge.setSource(source1);
		bridge.method();
		bridge.setSource(source2);
		bridge.method();
	}
}
