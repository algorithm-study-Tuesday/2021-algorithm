import java.util.*;
public class BOJ14916 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int map[] = new int[1000001];
		for (int i=0;i<=n;i++) {
			map[i] = -1;
		}
		map[0] = -1;
		map[1] = -1;
		map[2] = 1;
		map[3] = -1;
		map[4] = 2;
		map[5] = 1;
		map[6] = 3;
		map[7] = 2;
		map[8] = 4;
		map[9] = 3;
		if (n<=9) {
			System.out.println(map[n]);
			return ;
		}
		for (int i=9;i<=n;i++) {
			map[i] = Math.min(map[i-2], map[i-5])+1;
		}
		System.out.println(map[n]);
	}

}
