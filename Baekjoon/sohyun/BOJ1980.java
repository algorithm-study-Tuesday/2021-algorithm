import java.util.*;

public class BOJ1980 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int t = scan.nextInt();
		int maxN = t/n;
		int maxM = t/m;
		int resmin = 0;
		if (t<n&&t<m) {
			System.out.println("0 "+t);
			return;
		}
		for (int i=t;i>0;i--) {
			for (int j=0;j<=maxN;j++) {
				for (int k=0;k<=maxM;k++) {
					if((j*n+k*m)==i) {
						list.add(j+k);
					}
				}
			}
			if (list.size()!=0) {
				resmin=i; 
				break;
				}
		}
		Collections.sort(list);
		System.out.printf("%d %d",list.get(list.size()-1),t-resmin);
	}

}
