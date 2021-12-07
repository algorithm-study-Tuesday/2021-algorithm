import java.util.Scanner;

public class BOJ17253 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		if (N==0) {System.out.println("NO"); return;}
		while (N!=0) {
			if (N % 3 > 1) { System.out.println("NO"); return ; }
			N /= 3;
		}
		if (N==0) System.out.println("YES");
		else System.out.println("NO");
	}

}
