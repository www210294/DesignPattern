package designPattern_state;

public class State {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	public void method1() {
		System.out.println("executing the first opt...");
	}
	public void method2() {
		System.out.println("executing the second opt...");
	}
}
