/* This class is client code that 
 * 
 */
public class DoMath {

	public static void main(String[] args) {
			System.out.println(Calculate.square(5));
			System.out.println(Calculate.cube(2));
			System.out.println(Calculate.average(1, 2));
			System.out.println(Calculate.average(1, 2, 3));
			System.out.println(Calculate.toDegrees(3.14159));
			System.out.println(Calculate.toRadians(45));
			System.out.println(Calculate.toImproperFrac(1, 2, 3));
			System.out.println(Calculate.toMixedNum(7, 2));
			System.out.println(Calculate.foil(2,  3,  6,  -7, "n"));
			System.out.println(Calculate.isDivisibleBy(1, 2));
			System.out.println(Calculate.absValue(-3233));
			System.out.println(Calculate.max(1, 923));
			//System.out.println(Calculate.max(1.7, 2.3, 3.8));
			System.out.println(Calculate.exponent(2, 3));
	}

}
