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
	public static boolean isDivisibleBy (int num1, int num2) {
		return num1 % num2 == 0;
	}
	public static double absValue (double num) {
		if (num < 0) {
			return num * -1;
		} else {
			return num;
		}
	}
	public static double max (double num1, double num2) {
		if (num1 < num2) {
			return num2;
		} else {
			return num1;
		}
	}
	public static double max (double num1, double num2, double num3) {
		if (num1 < num2) {
			if (num2 < num3) {
				return num3;
			} else {
				return num2;
			}
		} else if (num2 < num3) {
			if (num3 < num1) {
				return num1;
			} else {
				return num3;
			}
		} else if (num3 < num1) {
			if (num1 < num2) {
				return num2;
			} else {
				return num1;
			}
		}
	}
	public static int min (int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}
	public static double round2 (double num) {
		return num;
	}
	
	// Part 3
	public static double exponent (double num, int power) {
		if (power == 0) {
			num = 1;
		} else if (power > 1) {
			for (int i = 1; i < power; i++) {
				// use cubed and square methods
			}
		}
		return num;
	}
	public static int factorial ()
