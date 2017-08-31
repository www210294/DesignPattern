package designPattern_strategy;

public class Minus extends AbstractCalculator implements ICalculator{
	
	public int calculate(String exp) {
		int[] nums = split(exp, "-");
		return nums[0] - nums[1];
	}
	
}
