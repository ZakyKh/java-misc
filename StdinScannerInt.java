import java.util.Scanner;

public class StdinScannerInt {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		System.out.printf("First number is %d%n", num1);
		System.out.printf("Second number is %d%n", num2);
	}
}