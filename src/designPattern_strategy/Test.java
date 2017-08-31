
package designPattern_strategy;

public class Test {
	public static void main(String[] args) {
		String exp = "8+9";
		ICalculator cal = new Plus();
		System.out.println(cal.calculate(exp));
	}
}
