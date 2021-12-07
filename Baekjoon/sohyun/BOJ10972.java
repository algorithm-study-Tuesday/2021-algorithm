import java.util.Scanner;

public class BOJ10972 {
	static int N;
	static int[] num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		num = new int[N];
		
		for (int i=0;i<N;i++) {
			num[i] = scan.nextInt();
		}
		if(N==1) {
			System.out.println("-1");
			return ;
		}
		for (int i=1;i<N;i++) {
			if (num[i]>num[i-1]) break;
			if(i==N-1) {
				System.out.println("-1");
				return;
			}
		}
		if (permutation(num)) {
			for(int i=0;i<N;i++) {
				System.out.print(num[i]+" ");
			}
		}
	}
	
	public static boolean permutation(int[] array) {
		int a= array.length - 1;
		while (a>0&&array[a-1]>=array[a]) a--;
		if (a<=0) return false;
		
		int b = array.length - 1;
		while(array[a-1]>=array[b]) b--;
		
		int tmp = array[a-1];
		array[a-1] = array[b];
		array[b] = tmp;
		
		int start = a;
		int end = array.length - 1;
		while (start < end) {
			tmp = array[start];
			array[start] = array[end];
			array[end] = tmp;
			start ++;
			end --;
		}
		return true;
		
	}

}
