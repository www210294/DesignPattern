package designPattern_memento;

public class Memento { //Memento��Originalû�й�����ͨ��storage������ϵ��
	private String value;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Memento(String value) {
		this.value = value;
	}
}
