import java.util.Scanner;

public class BOJ1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		if (A>B) 	System.out.println(">");
		else if (A<B) 	System.out.println("<");
		else System.out.println("==");
	}

}
