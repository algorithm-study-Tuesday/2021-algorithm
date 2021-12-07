import java.io.*;
import java.util.*;

public class BOJ2170 {
	//public static LinkedList<pair<Integer, Integer>> pairArr = new LinkedList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[][] pos = new int[n][2];
        int result=0;
        
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            int p1 = Integer.parseInt(line.split(" ")[0]);
            int p2 = Integer.parseInt(line.split(" ")[1]);
            pos[i][0] = p1;
            pos[i][1] = p2;
        }
        
        Arrays.sort(pos, new Comparator<int[]>() { //x좌표 오름차순 정렬. x좌표 같으면 y좌표 오름차순 정렬
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0])  return o1[1] - o2[1];
                else  return o1[0] - o2[0];
            }
        }); 
        
        int min = pos[0][0];//이전 선의 x좌표
        int max = pos[0][1];//이전 선의 y좌표
        int len = max - min;
        for(int i = 1; i < n; i++) {
            if(min <= pos[i][0] && pos[i][1] <= max) { //현재 선이 이전 선에 포함된다면
                continue;
            } else if(pos[i][0] < max) { //현재 선의 시작점이 이전 선에 포함된다면
                len += pos[i][1] - max;
            } else { //현재 선과 이전 선이 겹치지 않는다면
                len += pos[i][1] - pos[i][0];
            }
            min = pos[i][0];
            max = pos[i][1];
        }
        System.out.println(len);
    }
}

/*
 * public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		LinkedList<pair<Integer, Integer>> pairArr = new LinkedList<pair<Integer, Integer>>();
		for (int i=0;i<N;i++) {
			int start = scan.nextInt();
			int end = scan.nextInt();
			pairArr.add(new pair(start,end));
		}
		Collections.sort(pairArr, new Comparator<pair<Integer, Integer>>() {
			@Override
			public int compare(pair<Integer, Integer> o1, pair<Integer, Integer> o2) {
				return (o1.S != o2.S ? o2.S - o1.S : o2.E.compareTo(o1.E));
			}

		});
		int pin = pairArr.get(0).S;
		int ret = pairArr.get(0).E - pairArr.get(0).S;
		for (int i=0;i<N;i++) {
			System.out.println(pairArr.get(i).S);
			System.out.println(pairArr.get(i).E);
		}
		System.out.println();
		for (int i=0;i<N;i++) {
			System.out.println(ret);
			if (pin <  pairArr.get(i).E) 	ret = ret +  pairArr.get(i).E - pairArr.get(i).S;
			else ret = ret + pin - pairArr.get(i).S;
			pin = pairArr.get(i).S;
		}
		System.out.println(ret);
	}
	public static class pair<start,end> {
		start S;
		end E;
		public  pair(start S, end E) {
			this.S = S;
			this.E = E;
		}
	}
 */



/*
import java.util.Scanner;

public class BOJ2170 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int ret = 0;
		boolean[] Pmap = new boolean[1000000001];
		boolean[] Mmap = new boolean[1000000001];
		for (int i=0;i<N;i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			if (x>=0&&y>=0) {
				for (int j=x;j<y;j++) {
					Pmap[j]=true;
				}
			}
			else if (x<0&&0<y) {
				for (int j=0;j<(-1)*x;j++) {
					Mmap[j]=true;
				}
				for (int j=0;j<y;j++) {
					Pmap[j]=true;
				}
			}
			else {
				for (int j=(-1)*y;j<(-1)*x;j++) {
					Mmap[j]=true;
				}
			}
		}
		for (int i=0;i<1000000001;i++) {
			if (Pmap[i]==true) ret++;
			if (Mmap[i]==true) ret++;
		}
		System.out.println(ret);
	}

}

*/