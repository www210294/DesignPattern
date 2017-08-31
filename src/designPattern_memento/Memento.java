package designPattern_memento;

public class Memento { //Memento和Original没有关联，通过storage建立联系。
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
