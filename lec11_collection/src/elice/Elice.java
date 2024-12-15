package elice;

import java.util.Scanner;

public class Elice {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Rectangle r1 = new Rectangle();
		r1.width = scan.nextInt();
		r1.height = scan.nextInt();
		r1.area();
		r1.length();
		System.out.println("면적:" + r1.area());
		System.out.println("둘레:" + r1.length());
	}

}
