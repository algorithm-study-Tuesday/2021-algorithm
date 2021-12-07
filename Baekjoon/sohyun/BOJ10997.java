import java.util.Scanner;

public class BOJ10997 {
static char map[][];
 static int N;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		map = new char[3*N+1][4*(N-1)+1];

		if (N==1) {
			System.out.println("*");
			return ;
		}
		int x = 0, y = 4*N - 4;

		star(x,y,N);
		
		for (int i=0;i<=3*N;i++) {
			for (int j=0;j<=4*(N-1);j++) {
				System.out.print(map[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static void star(int x, int y, int n) {
		 if (n==2) {
			 map[x][y-1] = '*';
		     map[x+1][y-1] = '*';
		     map[x+2][y-1] = '*';
		     return;
		}
		for (int i = 1; i < 3*n+1; i++) map[x][y--] = '*';
	    for (int i = 1; i < 4*n-3; i++) map[x++][y] = '*';
	    for (int i = 1; i < 3*n+1; i++) map[x][y++] = '*';
	    for (int i = 1; i < 4*n-5; i++) map[x--][y] = '*';
	    
	    map[x][y] = '*'; 
	    y--;
	    map[x][y] = '*';
	    
	   
	    star(n-1, x, y-1);
	}
	
}
