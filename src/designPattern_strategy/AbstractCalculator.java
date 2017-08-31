package designPattern_strategy;

public abstract class AbstractCalculator {
	public int[] split(String exp, String opt) {
		int[] nums = new int[2];
		String[] strArr = new String[2];
		strArr = exp.split(opt);
		nums[0] = Integer.parseInt(strArr[0]);
		nums[1] = Integer.parseInt(strArr[1]);
		return nums;
	}
}
