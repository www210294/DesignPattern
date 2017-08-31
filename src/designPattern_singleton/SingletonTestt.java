package designPattern_singleton;

import java.util.HashSet;
import java.util.Set;

public class SingletonTestt {

	public static void main(String[] args) throws InterruptedException {
		final Set<InnerSingleton> set = new HashSet<InnerSingleton>();
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {
				public void run() {
					for (int j = 0; j < 100; j++) {
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						final InnerSingleton instance = InnerSingleton.getInstance();
						synchronized (set) {
							set.add(instance);
						}
						
					}
				}
			}).start();
		}
		Thread.sleep(4000);
		System.out.println(set.size());

	}

}
