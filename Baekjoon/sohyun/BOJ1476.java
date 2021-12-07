import java.util.Scanner;

public class BOJ1476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int E = scan.nextInt();
		int S = scan.nextInt();
		int M = scan.nextInt();
		if (E==15) E=0;
		if (S==28) S=0;
		if (M==19) M=0;
		int result  = 0;
		while (true) {
			result ++;
			System.out.println(result);
			if (result%15==E&&result%28==S&&result%19==M) break;
		}
		System.out.println(result);
	}

}
