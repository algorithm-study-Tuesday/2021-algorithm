import java.util.*;

public class BOJ17829 {
	public static int[][] map = new int[1025][1025];
	public static int[][] sum = {{1,0},{1,1}};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i=0;i<num;i++) {
			for (int j=0;j<num;j++) {
				map[i][j] = scan.nextInt();
			}
		}
		ret(num);
		System.out.println(map[0][0]);
	}
	public static void ret (int num) {
		if (num==1) return ;
		for (int i=0;i<num;i=i+2) {
			for (int j=0;j<num;j=j+2) {
				int[] tmp = {map[i][j],map[i][j+1],map[i+1][j],map[i+1][j+1]};
				Arrays.sort(tmp);
				map[i/2][j/2] = tmp[2];
			}
		}
		ret(num/2);
	}
}

