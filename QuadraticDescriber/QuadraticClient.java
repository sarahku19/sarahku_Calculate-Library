import java.util.*;

public class QuadraticClient {

	public static void main (String [] args) {
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide values for coefficients a, b, and c");
		Scanner userInput = new Scanner(System.in);
		String answer = "yes";
		while (answer.equals("yes")) {
			System.out.print("a: ");
			double a = userInput.nextDouble();
			System.out.println();
			System.out.print("b: ");
			double b = userInput.nextDouble();
			System.out.println();
			System.out.print("c: ");
			double c = userInput.nextDouble();
			System.out.println();
			Quadratic.quadrDescriber(a, b, c);
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			answer = userInput.next();
			if (answer == "quit")
				break;
		}
	}

}
