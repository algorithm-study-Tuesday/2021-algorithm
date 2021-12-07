import java.util.Scanner;

public class BOJ2563 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int map[][] = new int[100][100];
		int x, y;
		int result=0;
		for (int i=0;i<N;i++) {
			x = scan.nextInt();
			y = scan.nextInt();
			for (int j=0;j<100;j++) {
				for (int k=0;k<100;k++) {
					if (x<=j&&y<=k&&j<x+10&&k<y+10) {
						map[j][k] = map[j][k]+1;
					}
				}
			}
		}
		
		for (int j=0;j<100;j++) {
			for (int k=0;k<100;k++) {
				if(map[j][k] !=0) result ++;
			}
		}
		System.out.println(result);
	}

}
