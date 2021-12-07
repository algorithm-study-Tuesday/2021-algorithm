import java.util.Scanner;

public class BOJ10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		for (int i=0;i<N;i++) {
			int tmp = scan.nextInt();
			if (tmp < X) System.out.print(tmp+" ");
		}
	}

}
