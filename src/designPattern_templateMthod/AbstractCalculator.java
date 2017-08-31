package designPattern_templateMthod;


public abstract  class AbstractCalculator {
	public final int calculate(String exp, String opt) { //父类方法包含对子类方法的调用。
		int arr[] = split(exp, opt);
		return calculate(arr[0], arr[1]);
	}
	abstract public int calculate(int n1, int n2);//子类必须有自己的实现
	public int[]  split(String exp, String opt) {
		int[] nums = new int[2];
		String[] strArr = new String[2];
		strArr = exp.split(opt);
		nums[0] = Integer.parseInt(strArr[0]);
		nums[1] = Integer.parseInt(strArr[1]);
		return nums;
	}
}
