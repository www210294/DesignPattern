package designPattern_memento;

public class Original {
	private String val;

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
	public Original(String val) {
		this.val = val;
	}
	public Memento creatMemento() {
		return new Memento(val);
	}
	public void  restoreMemento(Memento memento) {
		this.val = memento.getValue();
	}
	public static void main(String[] args) {
		Original original = new Original("AAAA");
		Storage storage = new Storage(original.creatMemento());
		System.out.println("初始化类： "+ original.getVal());
		original.setVal("BBBB");
		System.out.println("修改后： " + original.getVal());
		original.restoreMemento(storage.getMemento());
		System.out.println("恢复后： " + original.getVal());
	}
}
