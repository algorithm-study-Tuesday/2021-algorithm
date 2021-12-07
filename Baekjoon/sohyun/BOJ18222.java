import java.util.Scanner;

public class BOJ18222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long K = scan.nextLong();
		recur(K);
		System.out.println(recur(K-1));
		
	}
	public static long recur(long n) {
		if(n==0) return 0;
		if(n==1) return 1;
		if (n%2==1) return 1-recur(n/2);
		else return recur(n/2);
	}
}
