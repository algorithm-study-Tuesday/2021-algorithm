import java.util.*;

public class BOJ1461 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		ArrayList minus = new ArrayList<Integer>();
		ArrayList plus = new ArrayList<Integer>();
		for (int i=0;i<N;i++) {
			int tmp = scan.nextInt();
			if (tmp < 0) minus.add(tmp);
			else plus.add(tmp);
		}
		Collections.sort(minus);
		Collections.sort(plus);
		Collections.reverse(plus);
		int ret = 0;
		
		if (minus.size()==0) {
			for (int i=M;i<plus.size();i=i+M) {
				ret = ret + (int)plus.get(i)*2;
			}
			ret = ret + (int)plus.get(0);
		}
		else if (plus.size() == 0) {
			for (int i=M;i<minus.size();i=i+M) {
				ret = ret + (int)minus.get(i)*(-2);
			}
			ret =  ret + (int)minus.get(0)*(-1); 
		}
		else {
			int max = 0;
			for (int i=M;i<minus.size();i=i+M) {
				ret = ret + (int)minus.get(i)*(-2);
			}
			
			for (int i=M;i<plus.size();i=i+M) {
				ret = ret + (int)plus.get(i)*2;
			}
			if ((int)minus.get(0)*(-1)>(int)plus.get(0)) 	ret = ret + (int)minus.get(0)*(-1) + 2*(int)plus.get(0);
			else ret = ret + (int)minus.get(0)*(-2) + (int)plus.get(0);
			
		}
		System.out.println(ret);
	}

}
