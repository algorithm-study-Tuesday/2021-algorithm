import java.util.ArrayList;
import java.util.Scanner;

public class BOJ1463{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int map[] = new int[1000001];
		
		map[1] = 0;
		map[2] = 1;
		map[3] = 1;
		for (int i=4;i<N+1;i++) {
			if (i%3==0&&i%2==0) 	map[i] = Math.min(map[i/3]+1, map[i/2]+1);
			else if(i%3==0) 	map[i] = map[i/3]+1;
			else if(i%2==0) 	map[i] = map[i/2]+1;
			else map[i] = map[i-1]+1;
			map[i]=Math.min(map[i], map[i-1]+1);
		}
 		System.out.println(map[N]);
	}
}
