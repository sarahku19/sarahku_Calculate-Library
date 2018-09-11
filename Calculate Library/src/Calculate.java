/* This class contains methods that perform various math operations.
 * @author Sarah Ku
 * @version 0.1
 */
public class Calculate {
	// Part 1
	// returns the square of the input
	public static int square (int num) {
		return num * num;
	}
	public static int cube (int num) {
		return num * num * num;
	}
	public static double average (double num1, double num2) {
		return (num1 + num2) / 2;
	}
	public static double average (double num1, double num2, double num3) {
		return (num1 + num2 + num3) / 3;
	}
	public static double toDegrees (double rad) {
		return rad * 180 / 3.14159;
	}
	public static double toRadians (double deg) {
		return deg * 3.14159 / 180;
	}
	public static double discriminant (double a, double b, double c) {
		return b * b - 4 * a * c;
	}
	public static String toImproperFrac (int wholeNum, int numerator, int denominator) {
		return (wholeNum * denominator + numerator) + "/" + denominator;
	}
	public static String toMixedNum (int numerator, int denominator) {
		return numerator / denominator + " " + numerator % denominator + "/" + denominator;
	}
	public static String foil (int num1, int num2, int num3, int num4, String x) {
		return (num1 * num3 + x + "^2") + " + " + (num2 * num3 + num1 * num4 + x) + " + " + (num2 * num4);
	}
	
	// Part 2
	
}
