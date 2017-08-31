package designPattern_templateMthod;

public class Plus extends AbstractCalculator{
	@Override
	public int calculate(int n1, int n2) {
		return n1 + n2;
	}
	public static void main(String[] args) {
		String exp = "99+121";
		AbstractCalculator calculator = new Plus();
		System.out.println(calculator.calculate(exp, "\\+"));
		System.out.println(calculator.calculate(2, 3));
	}
}
