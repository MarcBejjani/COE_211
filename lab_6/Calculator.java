public class Calculator{
	
	public static String add(int val1, int val2) {
		return val1 + " + " + val2 + " = " + (val1 + val2);
	}
	
	public static String subtract(int val1, int val2) {
		return val1 + " - " + val2 + " = " + (val1 - val2);
	}
	
	public static String multiply(int val1, int val2) {
		return val1 + " * " + val2 + " = " + (val1 * val2);
	}
	
	public static String divide(int val1, int val2) {
		return val1 + " / " + val2 + " = " + (val1 / val2);
	}
}