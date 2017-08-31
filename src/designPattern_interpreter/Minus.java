package designPattern_interpreter;

public class Minus implements Expression {

	public int interpret(Context context) {
		return context.getN1() - context.getN2();
	}

}
