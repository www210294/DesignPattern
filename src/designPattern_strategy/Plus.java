

package designPattern_strategy;

public class Plus extends AbstractCalculator implements ICalculator{
	
	public int calculate(String exp) {
		int[] nums = split(exp, "\\+");
		return nums[0] + nums[1];
	}
	
}
