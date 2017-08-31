package designPattern_singleton;

public class InnerSingleton {
	private InnerSingleton(){}
	private static class Factory {
		private static InnerSingleton instance = new InnerSingleton();
	}
	public static InnerSingleton getInstance() {
		return Factory.instance;
	}
}
