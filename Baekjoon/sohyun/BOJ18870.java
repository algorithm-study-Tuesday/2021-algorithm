import java.util.*;
import java.io.*;
public class BOJ18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = new Integer(br.readLine());
        int[] arr = new int[N];
        int[] arrClone;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        arrClone = arr.clone();

        Arrays.sort(arrClone);

        for (int i = 0; i < arrClone.length; i++) {
            if (!map.containsKey(arrClone[i])) {
                map.put(arrClone[i], count++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }

        System.out.println(sb);
    }
}



/*
public class BOJ18870 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X[] = new int[N];
		int X_[] = new int[N]; 
		ArrayList<Pair> list = new ArrayList();
		for (int i=0;i<N;i++) {
			int tmp = scan.nextInt();
			X[i] = tmp;
			X_[i] =tmp;
		}
		
		Arrays.sort(X);
		int tmp = X[0];
		int count = 1;
		list.add(new Pair(0,tmp));
		for (int i=1;i<N;i++) {
			if (tmp==X[i]) continue;
			else {
				list.add(new Pair(count+list.get(list.size()-1).x,X[i]));
				count = 1;
				tmp = X[i];
			}
		}
		for (int i=0;i<N;i++) {
			for  (int j=0;j<list.size();j++) {
				if (list.get(j).y==X_[i]) {
					System.out.print(list.get(j).x+" ");
				}
			}
			
		}
	}
	static class Pair {
	    private int x;
	    private int y;

	    Pair(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	    public int getX(){
	        return x;
	    }

	    public int getY(){
	        return y;
	    }
	}
}
*/