import java.util.*;

public class BOJ1057 {
	static int N;
	static int A, B;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		A = scan.nextInt();
		B = scan.nextInt();
		
		System.out.println(getRound());
	}
	public static int getRound() {
		int round = 1;
		while(N>1) {
			if((A+1)/2==(B+1)/2) break;
			A=(A+1)/2;
			B=(B+1)/2;
			round++;
			N=N/2;
		}
		return round;
	}

}


