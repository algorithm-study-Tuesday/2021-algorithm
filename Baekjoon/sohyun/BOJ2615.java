import java.util.Scanner;

public class BOJ2615 {
	static int[][] map;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		map = new int[19][19];
		for (int i=0;i<19;i++) {
			for (int j=0;j<19;j++) {
				map[i][j] = scan.nextInt();
			}
		}
		for (int i=0;i<15;i++) {
			for (int j=0;j<19;j++) {
				if(map[i][j]!=0&&map[i][j]==map[i+1][j]&&map[i+1][j]==map[i+2][j]&&map[i+2][j]==map[i+3][j]&&map[i+3][j]==map[i+4][j]) {
					if(i!=0&&map[i-1][j]==map[i][j]) continue;
					if(i!=14&&map[i+5][j]==map[i][j]) continue;
					System.out.println(map[i][j]);
					System.out.printf("%d %d",i+1,j+1);
					return ;
				}
			}
		}
		for (int i=0;i<19;i++) {
			for (int j=0;j<15;j++) {
				if(map[i][j]!=0&&map[i][j]==map[i][j+1]&&map[i][j+1]==map[i][j+2]&&map[i][j+2]==map[i][j+3]&&map[i][j+3]==map[i][j+4]) {
					if(j!=0&&map[i][j-1]==map[i][j]) continue;
					if(j!=14&&map[i][j+5]==map[i][j]) continue;
					System.out.println(map[i][j]);
					System.out.printf("%d %d",i+1,j+1);
					return ;
				}
			}
		}
		for (int i=0;i<15;i++) {
			for (int j=0;j<15;j++) {
				if(map[i][j]!=0&&map[i][j]==map[i+1][j+1]&&map[i+1][j+1]==map[i+2][j+2]&&map[i+2][j+2]==map[i+3][j+3]&&map[i+3][j+3]==map[i+4][j+4]) {
					if(i!=0&&j!=0&&map[i-1][j-1]==map[i][j]) continue;
					if(i!=14&&j!=14&&map[i+5][j+5]==map[i][j]) continue;
					System.out.println(map[i][j]);
					System.out.printf("%d %d",i+1,j+1);
					return ;
				}
			}
		}
		for (int i=4;i<19;i++) {
			for (int j=0;j<15;j++) {
				if(map[i][j]!=0&&map[i][j]==map[i-1][j+1]&&map[i-1][j+1]==map[i-2][j+2]&&map[i-2][j+2]==map[i-3][j+3]&&map[i-3][j+3]==map[i-4][j+4]) {
					if(i!=4&&j!=14&&map[i-5][j+5]==map[i][j]) continue;
					if(i!=18&&j!=0&&map[i+1][j-1]==map[i][j]) continue;
					System.out.println(map[i][j]);
					System.out.printf("%d %d",i+1,j+1);
					return ;
				}
			}
		}
		System.out.println(0);
	}

}
