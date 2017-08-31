package designPattern_interpreter;

public class Context {
	private int n1;
	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	private int n2;
	
	public Context(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	public static void main(String[] args) {
		System.out.println(
				 new Minus().interpret(
						 new Context(new Minus().interpret(new Context(7, 3)),
								 3))
				);
	}
}
