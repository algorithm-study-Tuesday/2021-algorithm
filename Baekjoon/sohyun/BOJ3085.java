import java.util.Arrays;
import java.util.Scanner;

public class BOJ3085 {
	static int check(char[][] a) {
		int n = a.length;
		int ans = 1;
		for (int i = 0; i < n; i++) {
			int cnt = 1;
			for (int j = 1; j < n; j++) {
				if (a[i][j] == a[i][j - 1]) {
					cnt += 1;
				} else {
					cnt = 1;
				}
				if (ans < cnt)
					ans = cnt;
			}
			cnt = 1;
			for (int j = 1; j < n; j++) {
				if (a[j][i] == a[j - 1][i]) {
					cnt += 1;
				} else {
					cnt = 1;
				}
				if (ans < cnt)
					ans = cnt;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] a = new char[n][n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.next().toCharArray();
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j + 1 < n) {
					char t = a[i][j];
					a[i][j] = a[i][j + 1];
					a[i][j + 1] = t;
					int temp = check(a);
					if (ans < temp)
						ans = temp;
					t = a[i][j];
					a[i][j] = a[i][j + 1];
					a[i][j + 1] = t;
				}
				if (i + 1 < n) {
					char t = a[i][j];
					a[i][j] = a[i + 1][j];
					a[i + 1][j] = t;
					int temp = check(a);
					if (ans < temp)
						ans = temp;
					t = a[i][j];
					a[i][j] = a[i + 1][j];
					a[i + 1][j] = t;
				}
			}
		}
		System.out.println(ans);
	}
}



//https://1-7171771.tistory.com/39 여기 설명과 코드 참고..



/*
import java.util.Arrays;
import java.util.Scanner;

public class BOJ3085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int max =0; 
		int max1 = 0;
		scan.nextLine();
		int[][] map = new int[N][N];
		
		for (int i=0;i<N;i++) {
			String tmp = scan.nextLine();
			char[] myChars =tmp.toCharArray();
			for(int j=0;j<N;j++) {
				if (myChars[j]=='C') {
					map[i][j] = 0;
				}
				else if (myChars[j]=='P') {
					map[i][j] = 1;
				}
				else if (myChars[j]=='Z') {
					map[i][j] = 2;
				}
				else if (myChars[j]=='Y') {
					map[i][j] = 3;
				}
			}
		}
		for (int i=0;i<N;i++) {
			for(int j=1;j<N;j++) {
				int[] count = new int[4];
				int[] count1 = new int[4];
				int tmp = map[i][j-1];
				map[i][j-1] = map[i][j] ;
				map[i][j] = tmp;
				for (int k=0;k<N;k++) {
					if(0==map[k][j]) {
						count[0]++;
					}
					else if(1==map[k][j]) {
						count[1]++;
					}
					else if(2==map[k][j]) {
						count[2]++;
					}
					else {
						count[3]++;
					}
				}
				for (int k=0;k<N;k++) {
					if(0==map[k][j-1]) {
						count1[0]++;
					}
					else if(1==map[k][j-1]) {
						count1[1]++;
					}
					else if(2==map[k][j-1]) {
						count1[2]++;
					}
					else {
						count1[3]++;
					}
				}
				Arrays.sort(count);
				Arrays.sort(count1);
				max =Math.max(max, count[3]);
				max =Math.max(max, count1[3]);
				tmp = map[i][j-1];
				map[i][j-1] = map[i][j] ;
				map[i][j] = tmp;
				
			}
		}
		for (int i=1;i<N;i++) {
			for(int j=0;j<N;j++) {
				int[] count = new int[4];
				int[] count1 = new int[4];
				int tmp = map[i-1][j];
				map[i-1][j] = map[i][j] ;
				map[i][j] = tmp;
				for (int k=0;k<N;k++) {
					if(0==map[i][k]) {
						count[0]++;
					}
					else if(1==map[i][k]) {
						count[1]++;
					}
					else if(2==map[i][k]) {
						count[2]++;
					}
					else {
						count[3]++;
					}
				}
				for (int k=0;k<N;k++) {
					if(0==map[i-1][k]) {
						count1[0]++;
					}
					else if(1==map[i-1][k]) {
						count1[1]++;
					}
					else if(2==map[i-1][k]) {
						count1[2]++;
					}
					else {
						count1[3]++;
					}
				}
				Arrays.sort(count);
				Arrays.sort(count1);
				max1 =Math.max(max, count[3]);
				max1 =Math.max(max, count1[3]);
				tmp = map[i-1][j];
				map[i-1][j] = map[i][j] ;
				map[i][j] = tmp;
			}
		}
		System.out.print(Math.max(max, max1));
	}

}
*/
