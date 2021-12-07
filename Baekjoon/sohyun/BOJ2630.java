import java.util.Scanner;

public class BOJ2630 {
	static int[][] map;
	static int N;
	static int white = 0;
	static int blue = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		map = new int[N][N];
		for (int i=0;i<N;i++) {
			for (int j=0;j<N;j++) {
				map[i][j] = scan.nextInt();
			}
		}
		apart(0,0,N);
		System.out.println(white);
		System.out.println(blue);
	}
	public static void apart(int x1, int y1, int length) {
		if (check(x1,y1,length)==true) {
			if (map[x1][y1]==0) white ++;
			else blue ++;
			return ; 
		}
		length = length/2;
		apart(x1,y1,length);
		apart(x1+length,y1,length);
		apart(x1,y1+length,length);
		apart(x1+length,y1+length,length);
	}
	public static boolean check(int x1, int y1, int length) {
		int pin = map[x1][y1];
		for (int i=x1;i<x1+length;i++) {
			for (int j=y1;j<y1+length;j++) {
				if (pin!=map[i][j]) return false;
			}
		}
		return true;
	}

}
