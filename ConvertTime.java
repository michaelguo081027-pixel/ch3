import java.util.Scanner;

public class ConvertTime {
	public static void main(String[] args) {
		final int S_PER_H = 3600;
		final int S_PER_MIN = 60;
		Scanner in = new Scanner(System.in);
		System.out.print("How many seconds? ");
		int n = in.nextInt();
		int h = (int) (n / S_PER_H);
		int min = (int) ((n % S_PER_H) / S_PER_MIN);
		int s = (int) ((n % S_PER_H) % S_PER_MIN);
		System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds", n, h, min, s);
	}
}
