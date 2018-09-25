/* This class contains methods that perform various math operations.
 * @author Sarah Ku
 * @version ?
 */

public class Calculate {
	
	// Part 1
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
		return (b * b) - (4 * a * c);
	}
	public static String toImproperFrac (int wholeNum, int numerator, int denominator) {
		if (denominator == 0)
			throw new IllegalArgumentException("Denominator cannot be zero");
		return (wholeNum * denominator + numerator) + "/" + denominator;
	}
	public static String toMixedNum (int numerator, int denominator) {
		if (denominator == 0)
			throw new IllegalArgumentException("Denominator cannot be zero");
		return numerator / denominator + "_" + numerator % denominator + "/" + denominator;
	}
	public static String foil (int num1, int num2, int num3, int num4, String x) {
		return (num1 * num3 + x + "^2") + " + " + (num2 * num3 + num1 * num4 + x) + " + " + (num2 * num4);
	}
	
	// Part 2
	public static boolean isDivisibleBy (int num1, int num2) {
		if (num2 == 0)
			throw new IllegalArgumentException ("Cannot divide by zero");
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
		if (num1 == num2)
			throw new IllegalArgumentException("Both inputs are the same");
		if (num1 < num2) {
			return num2;
		} else {
			return num1;
		}
	}
	public static double max (double num1, double num2, double num3) {
		if (num1 == num2 || num2 == num3 || num1 == num3)
			throw new IllegalArgumentException("Two or three of the inputs are the same");
		if (num1 < num2) {
			if (num2 < num3) {
				return num3;
			} else if (num3 < num2) {
				return num2;
			}
		} else if (num2 < num3) {
			if (num3 < num1) {
				return num1;
			} else if (num1 < num3) {
				return num3;
			}
		} else if (num3 < num1) {
			if (num1 < num2) {
				return num2;
			} else if (num1 < num3) {
				return num1;
			}
		}
		// the following is to appease the compiler
		return num1;
	}
	public static int min (int num1, int num2) {
		if (num1 == num2)
			throw new IllegalArgumentException("Both inputs are the same");
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}
	public static double round2 (double num) {
		double newNum = num * 100;
		if (num < 0) {
			newNum -= 0.5;
		} else {
			newNum += 0.5;
		}
		newNum = (int) newNum;
		newNum /= 100;
		return newNum;
	}
	
	// Part 3
	public static double exponent (double base, int power) {
		double current = base;
		if (base <= 0)
			throw new IllegalArgumentException("Base cannot be zero or negative");
		if (power == 0) {
			current = 1;
		} else if (power > 1) {
			for (int i = 1; i < power; i++) {
				current *= base;
			}
		}
		double num = current;
		return num;
	}
	public static int factorial (int num) {
		if (num <= 0)
			throw new IllegalArgumentException("Factorial of " + num + " cannot be calculated");
		int current = num;
		for (int i = 1; i < num; i++) {
			current *= (num - i);
		}
		num = current;
		return num;
	}
	public static boolean isPrime (int num) {
		boolean result = true;
		if (num <= 1)
			throw new IllegalArgumentException("Input cannot be less than two");
		int i = 2;
		while (i < num) {
			if (Calculate.isDivisibleBy(num, i)) {
				result = false;
				return result;
			}
			i++;
		}
		// to appease the compiler
		return result;
	}
	public static int gcf (int num1, int num2) {
		int bigNum = (int) Calculate.max(num1, num2);
		int littleNum = Calculate.min(num1, num2);
		if (bigNum <= 0 || littleNum <= 0)
			throw new IllegalArgumentException("One or both numbers are zero");
		int gCF = 1;
		if (Calculate.isDivisibleBy(bigNum, littleNum)) {
			gCF = littleNum;
		}
		for (int i = 2; i <= littleNum; i++) {
			if (Calculate.isDivisibleBy(bigNum, i) && Calculate.isDivisibleBy(littleNum, i)) {
				gCF = i;
			}
		}
		return gCF;
	}
	/*public static double sqrt (double num) {
		double result = num;
		// code 
		return Calculate.round2(result);
	}*/
	
	/* Part 4
	public static String quadForm (int a, int b, int c) {
		
		double root1 = ((-1 * b) + Calculate.sqrt(Calculate.discriminant(a, b, c))) / (4 * a * c);
		double root2 = ((-1 * b) - Calculate.sqrt(Calculate.discriminant(a, b, c))) / (4 * a * c);
		
		boolean isRealRoot
		find number of roots
		
		if (no realRoots) {
			return "no real roots";
		} else if (1 realRoot) {
			return Calculate.round2(root);
		} else if (2 realRoots) {
			return Calculate.round2(root1) + " and " + Calculate.round2(root2);
		}
	}*/
}