import java.util.Scanner;

public class BOJ1748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int result = 0;
		int tmp = 100;
		if (N<10) {
			System.out.println(N); return ;
		}
		else {
			result = 9;
		}
		int i = 2;
		while (true) {
			//System.out.println(result);
			if(tmp-1>N) {
				result = result + i * (N - tmp/10 + 1);
				break;
			}
			result = result + (tmp*9/10) * i;
			i++;
			tmp = tmp*10;
		}
		System.out.println(result);
	}

}
