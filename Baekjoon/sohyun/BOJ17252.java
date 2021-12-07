import java.util.Scanner;

public class BOJ17252 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		if (N==0) {System.out.println("NO"); return;}
		int calc = (int)Math.pow(3, 19);
		for (int i=calc;i>=1;i=i/3) {
			if(N>=i) 	N = N - i;
			if (N==0) break;
		}
		if (N==0) System.out.println("YES");
		else System.out.println("NO");
	}

}
