import java.util.*;

public class BOJ13423 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
        while(t-->0) {
            int n = scan.nextInt();;
            int a[] = new int[n];
            for(int i=0; i<n; i++) a[i] = scan.nextInt();;
            
            int cnt = 0;
            Arrays.sort(a);
            for(int i=0; i<n-2; i++) {
                int k = i+2;
                for(int j=i+1; j<n-1; j++) {
                    int ba = a[j] - a[i];
                    
                    while(k < n && a[k] - a[j] < ba) {
                        k++;
                    }
                    
                    if(k == n) break;
                    
                    if(a[k] - a[j] == ba) cnt++;
                }
            }
            System.out.println(cnt);
	}
	}
}
