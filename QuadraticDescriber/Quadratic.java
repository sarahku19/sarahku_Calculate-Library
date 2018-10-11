
public class Quadratic {

	public static void quadrDescriber (double a, double b, double c) {
		System.out.println("Opens: " + direction(a));
		System.out.println("Axis of symmetry: " + axisOfSymmetry(b));
		System.out.println("Vertex: " + vertex(b, c));
		System.out.println("x-intercept(s): " + xIntercepts(a, b, c));
		System.out.println("y-intercept: " + yIntercept(b, c));
	}
	
	public static String direction (double a) {
		if (a < 0) {
			return "Down";
		} else if (a > 0) {
			return "Up";
		}
		return "Not a quadratic equation";
	}
	public static double axisOfSymmetry(double b) {
		return -1 * (b / 2);
	}
	public static String vertex (double b, double c) {
		double x = -1 * (b / 2);
		double y = c - square(b / 2);
		return "(" + x + ", " + y + ")";
	}
	public static String xIntercepts (double a, double b, double c) {
		return quadForm(a, b, c);
	}
	public static double yIntercept (double b, double c) {
		return c - square(b / 2);
	}

	// Calculate methods
	public static double square (double num) {
		return num * num;
	}
	public static double discriminant (double a, double b, double c) {
		return (b * b) - (4 * a * c);
	}
	public static double absValue (double num) {
		if (num < 0) {
			return num * -1;
		} else {
			return num;
		}
	}
	public static double min (double num1, double num2) {
		if (num1 == num2)
			throw new IllegalArgumentException("Both inputs are the same");
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
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
	public static double sqrt (double num) {
		if (num < 0)
			throw new IllegalArgumentException("Square root of " + num + " cannot be found");
		double result = num / 2;;
		while(absValue(num - (result * result)) > 0.005) {
			result = 0.5 * ((num / result) + result);
			
		}
		return round2(result);
	}
	public static String quadForm (double a, double b, double c) {
		if (discriminant(a, b, c) < 0) {
			return "no real roots";
		} else {
			double root1 = ((-1 * b) + sqrt(discriminant(a, b, c))) / (2 * a);
			double root2 = ((-1 * b) - sqrt(discriminant(a, b, c))) / (2 * a);
			if (root1 == root2) {
				return "" + round2(root1);
			} else {
				double littleRoot = min(root1, root2);
				double bigRoot = max(root1, root2);
				return round2(littleRoot) + " and " + round2(bigRoot);
			}
		}
	}

}
