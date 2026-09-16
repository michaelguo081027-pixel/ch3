import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		final double SLOPE_OF_RELATION = 1.8;
		final double COEFFICIENT_OF_RELATION = 32.0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a temperature in Celsius: ");
		double c = in.nextDouble();
		double f = c * SLOPE_OF_RELATION + COEFFICIENT_OF_RELATION;
		System.out.printf("%.1f C = %.1f F", c, f);
	}
}
