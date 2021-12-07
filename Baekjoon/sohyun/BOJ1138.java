import java.util.Scanner;

public class BOJ1138 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] num = new int[N];
		int[] ret = new int[N];
		for (int i=0;i<N;i++) {
			num[i] = scan.nextInt();
		}
		ret[num[0]] = 1;
		for (int i=1;i<N;i++) {
			int tmp = 0;
			boolean check = false;
			for (int j=0;j<N;j++) {
				if(num[i]==0&&ret[j]==0) {
					ret[j] = i+1;
					j= N;
					continue;
					}
				if (i==N-1&&ret[j]==0) {
					ret[j] = i+1;
					break;
				}
				if (tmp == num[i]&&ret[j]==0&&check) {
					ret[j] = i+1;
					break;
				}
				if(ret[j]==0) {
					tmp ++;
					check = true;
				}
			}
		}
		for (int i=0;i<N;i++) {
			System.out.printf(ret[i]+" ");
		}
		
	}
}

/*
if(tmp==0&&ret[j]==0) {
ret[j] = i+1;
continue;
}
*/