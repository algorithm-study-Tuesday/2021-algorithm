import java.util.*;
public class BOJ17219 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		scan.nextLine();
		 Map<String, String> map = new HashMap<>();
		for (int i=0;i<N;i++) {
			String[] tmp = scan.nextLine().split(" ");
			map.put(tmp[0],tmp[1]);
		}
		for (int i=0;i<M;i++) {
			String tmp = scan.nextLine();
			System.out.println(map.get(tmp));
			
		}
		
		 
	}

}
