package designPattern_flyweight;

import java.util.Vector;

public class ConnectionPool {
	//公共属性
	private Vector<Connection> pool;
	private String url = "jdbc:mysql://localhost:3306/test";
	private String usernameString= "root";
	private String passwordString= "root";
	private String drivalerclassName = "com.mysal.jdbc.Driver";
	
	private int poolsize = 100;
	private static ConnectionPool instance = null;
	Connection conn = null;
	//工厂模式
	public ConnectionPool() {
		pool = new Vector<Connection>(poolsize);
		for (int i = 0; i < poolsize; i++) {
			try {
				Class.forName(drivalerclassName);
				conn = new Connection();
				pool.add(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void release() {
		pool.add(conn);
	}
	public synchronized  Connection getConnection() {
		if (pool.size() > 0) {
			Connection connection = pool.get(0);
			pool.remove(connection);
			return connection;
		}else {
			return null;// 实际中将连接请求放入队列中
		}
	}
}
