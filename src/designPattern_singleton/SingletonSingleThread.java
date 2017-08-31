package designPattern_singleton;

public class SingletonSingleThread {
	private static SingletonSingleThread instance = null;
	private SingletonSingleThread() {};
	public static SingletonSingleThread getInstance() {
		if(instance == null) {
			instance = new SingletonSingleThread();
		}
		return instance;
	}
	public Object readResolve() {
		return instance;
	}
}
