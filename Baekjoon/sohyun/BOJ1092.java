import java.util.*;

public class BOJ1092 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 
        int n = scan.nextInt();
        
        ArrayList<Integer> crane = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            crane.add(scan.nextInt());
        }
        Collections.sort(crane, Collections.reverseOrder());
        
        int m = scan.nextInt();
        ArrayList<Integer> box = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            box.add(scan.nextInt());
        }
        Collections.sort(box, Collections.reverseOrder());
        
        if(crane.get(0) < box.get(0)) System.out.println("-1");
        else {
            int time = 0;
            while(!box.isEmpty()) {
                int idx = 0;
                for(int i = 0; i < crane.size();) {
                    if(idx == box.size()) break;
                    else if(crane.get(i) >= box.get(idx)) {
                        box.remove(idx);
                        i++;
                    }
                    else idx++;
                }
                time++;
            }
            System.out.println(time);
        }
	}
}
/*
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int limit[] =new int[N];
	int check[] = new int[N];
	for (int i =0;i<N;i++) {
		limit[i] = scan.nextInt();
	}
	Arrays.sort(limit);
	int M = scan.nextInt();
	int weight[] = new int[M+1];
	for (int i =0;i<M;i++) {
		weight[i] = scan.nextInt();
	}
	weight[M] = 10000001;
	Arrays.sort(weight);
	for (int i=0;i<N;i++) {
		for (int j=1;j<=M;j++) {
			if (weight[j-1]<=limit[i]&&limit[i]<weight[j]) {
				check[i] = j-1;
				break;
			}
		}
	}
	if (weight[M-1]>limit[N-1]) System.out.println(-1);
	else {
		
		int max = limit[0];
		int maxidx = 0;
		for (int i=1;i<N;i++) {
			if (limit[i]>max) {
				max = limit[i];
				maxidx = i;
				break;
			}
			
		}
		int sum =0;
		for (int i=maxidx+1;i<N;i++) {
			sum = sum +check[i];
			
		}
		if (sum%N==0) System.out.println(sum/(N-maxidx+1));
		else System.out.println(sum/(N-maxidx+1)+1);
	}
	
}
*/