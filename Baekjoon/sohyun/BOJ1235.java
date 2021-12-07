import java.util.Scanner;

public class BOJ1235 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		String[] arr = new String[N+1];
		
		for (int i=0;i<N;i++) {
			arr[i] = scan.nextLine();
		}
		
		for (int i=arr[0].length()-1;i>=0;i--) {
			String[] tmp = new String[N+1];
			for (int j=0;j<N;j++) {
				tmp[j] = arr[j].substring(i);
				//System.out.println(tmp[j]);
			}
			Loop1 :
			for (int j=0;j<N;j++) {
				String check = tmp[j];
				for (int k=j+1;k<N;k++) {
					if (check.equals(tmp[k])) 	break Loop1;
					if (j==N-2&&k==N-1) {
						System.out.println(check.length());
						return ;
					}
				}
			}
		}
	}

}
