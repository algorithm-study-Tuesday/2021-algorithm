import java.util.*;

public class BOJ1174 {
	static ArrayList<Long> arr = new ArrayList <Long>();
	static int[] num = {9,8,7,6,5,4,3,2,1,0};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		decrease(0,0);
		arr.sort(null);
		if (N>1023) System.out.println(-1);
		else
			System.out.println(arr.get(N-1));
	}
	static void decrease (long sum, int index) {
		if (!arr.contains(sum)) arr.add(sum);
		if (index >= 10) return;
		decrease((sum*10)+num[index],index+1);
		decrease(sum,index+1);
	}
}


//bfs 재귀 
/* 메모리 초과 코드 
ArrayList<Integer> arr = new ArrayList <Integer>();

Scanner scan = new Scanner(System.in);
int N = scan.nextInt();
if(N>=1023) {
	System.out.println("-1");
	return ;
}
else if (N==1022) {
	System.out.println("9876543210");
	return ;
}
for (int i=0;i<10;i++) arr.add(i);
boolean check = true;
for (int i=10;i<=987654321;i++) {
	char charArr[] = Integer.toString(i).toCharArray();
	check = true;
	for (int j=1;j<charArr.length;j++) {
		if  (charArr[j-1]<=charArr[j]) {
			check = false;
			break;
		}
	}
	if (check) {//System.out.println(i);
		arr.add(i);
	}
}
System.out.println(arr.get(N));
*/