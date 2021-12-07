import java.util.Scanner;

public class BOJ17248 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t=0;t<T;t++) {
			int X = scan.nextInt();
			int Y = scan.nextInt();
			int Z = scan.nextInt();
			int tmp = X;
			int count = 1;
			while (true) {
				if (X+Z*count > Y) break;
				else {
					count++;
					X = X+Z*count;
				}
			}
			System.out.println(count);
		}
	}

}
