package designPattern_iterator;

public class MyCollection implements Collection {
	public String str[] = {"A", "B", "C", "D"};
	public Iterator iterator() {
		return new MyIterator(this); //�������ص㣡����
	}

	public Object get(int i) {
		return str[i];
	}

	public int size() {
		return str.length;
	}

}
