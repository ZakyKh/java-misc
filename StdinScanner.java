import java.util.Scanner;

public class StdinScanner {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		String inp = in.nextLine();
		System.out.println(inp);
	}
}