import java.util.*;

public class BOJ2512 {
	static int[] arr;
	static int M;
	static int[] sum;
	public static int binarySearch(int[] a, int t){
        int first = 0;
        int last = a[a.length-1];
        int mid = 0;
        int total  = 0;
       while(first <= last){
           mid = (first + last) / 2 ;
           if(calculate(a, mid) > t)
               last = mid - 1;
           else{
               total = mid;
               first = mid + 1;
           }
       }
       return total;
    }
    public static int calculate(int[] a, int b){
        int total = 0;
        for(int i = 0; i < a.length; i++){
            if(b >= a[i])
                total += a[i];
            else
                total += b;
        }
        return total;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int total = 0;
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            total += a[i];
        }
        int t = sc.nextInt();
        Arrays.sort(a);

        if(total <= t)
            System.out.println(a[a.length-1]);
        else
            System.out.println(binarySearch(a, t));

        sc.close();
    }
}


/*
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in); 
int N = scan.nextInt();
arr = new int[N];
sum = new int[N];
arr[0] = scan.nextInt();
for (int i=1;i<N;i++) {
	arr[i] = scan.nextInt();
}
M = scan.nextInt();
Arrays.sort(arr);
sum[0] = arr[0];
for (int i=1;i<N;i++) {
	sum[i] = sum[i-1] + arr[i];
}
if (sum[N-1]<=M) {
	System.out.println(arr[N-1]);
	return ;
}
else binarySearch(0,N-1);
}
static int binarySearch(int low, int high) {
int mid;
if(low <= high) {
	mid = (low + high) / 2;
	int tmp = arr.length - mid;
	
	if(sum[mid]+tmp*mid==M) { // 탐색 성공 
		return
	} else if(key < arr[mid]) {
		return binarySearch(low, mid-1); // 왼쪽 부분 탐색 
	} else {
		return binarySearch(mid+1, high); // 오른쪽 부분 탐색 
	}
}

return -1; // 탐색 실패 
}
*/