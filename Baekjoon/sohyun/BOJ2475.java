import java.util.Scanner;

public class BOJ2475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int ret = 0;
		for (int i =0;i<5;i++) {
			int tmp = scan.nextInt();
			ret = ret + tmp*tmp;
		}
		System.out.println(ret%10);
	}

}
