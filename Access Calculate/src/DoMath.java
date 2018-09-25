/* This class is client code that 
 * 
 */
public class DoMath {
	public static void main(String[] args) {
		// Part 1
			System.out.println(Calculate.square(5));
			System.out.println(Calculate.cube(2));
			System.out.println(Calculate.average(1, 2));
			System.out.println(Calculate.average(1, 2, 3));
			System.out.println(Calculate.toDegrees(3.14159));
			System.out.println(Calculate.toRadians(45));
			System.out.println(Calculate.discriminant(1, 2, 1));
			System.out.println(Calculate.toImproperFrac(1, 2, 3));
			System.out.println(Calculate.toMixedNum(7, 2));
			System.out.println(Calculate.foil(2,  3,  6,  -7, "n"));
		// Part 2
			System.out.println(Calculate.isDivisibleBy(1, 2));
			System.out.println(Calculate.absValue(-3233));
			System.out.println(Calculate.max(1, 923));
			System.out.println(Calculate.max(1.7, 2.3, 3.8));
			System.out.println(Calculate.min(2, 32));
			System.out.println(Calculate.round2(-1234.574));
			
		// Part 3
			System.out.println(Calculate.exponent(1, 0));
			System.out.println(Calculate.factorial(4));
			System.out.println(Calculate.isPrime(16));
			System.out.println(Calculate.gcf(4, 8));
			//System.out.println(Calculate.sqrt(4));
			
		// Part 4
			//System.out.println(Calculate.quadForm(1, 2, 1));
	}

}
