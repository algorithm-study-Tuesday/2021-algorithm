import java.util.*;

public class BOJ12852{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		int map[] = new int[1000001];
		map[1] = 0;
		map[2] = 1;
		map[3] = 1;
		for (int i=4;i<N+1;i++) {
			if (i%3==0&&i%2==0) 	map[i] = Math.min(map[i/3]+1, map[i/2]+1);
			else if(i%3==0) 	map[i] = map[i/3]+1;
			else if(i%2==0) 	map[i] = map[i/2]+1;
			else map[i] = map[i-1]+1;
			map[i]=Math.min(map[i], map[i-1]+1);
		}
		System.out.println(map[N]);
		
		list.add(N);
		int i = N;
		while (true){
			if (i==1) break;
			
			if(map[i]==map[i/2]+1&&i%2==0) {
				i = i/2;
				list.add(i);
			}
			else if(map[i]==map[i/3]+1&&i%3==0) {
				i = i/3;
				list.add(i);
			}
			else if (map[i]==map[i-1]+1) {
				i = i - 1;
				list.add(i);
			}
		}
		for(int j=0;j<list.size();j++) {
			System.out.print(list.get(j)+" ");
		}
	}
}
