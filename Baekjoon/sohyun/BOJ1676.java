import java.util.Scanner;

public class BOJ1676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count = 0;
		count = N/5;
		count = count + N/25;
		count = count + N/ 125;
		System.out.println(count);
	}

}
