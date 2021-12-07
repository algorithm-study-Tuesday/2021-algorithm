import java.util.*;

public class BOJ16953 {
	static int A;
	static int B;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt();
		B = scan.nextInt();
		int cnt = 1;
		while (A != B){
            if (B < A) {
                System.out.println(-1);
                System.exit(0);
            }
            if (B % 10 == 1) B /= 10;
            else if (B % 2 == 0) B /= 2;
            else {
                System.out.println(-1);
                System.exit(0);
            }
            cnt++;
        }
		System.out.println(cnt);
	}
	
}


/*

public static void bfs(int A, int cnt) {
	Queue	<Pair> queue = new LinkedList<>();
	queue.add(new Pair(A,1));
	int next=0; 
	while(!queue.isEmpty()) {
		Pair pin = queue.poll();
		for (int i=0;i<2;i++) {
			if (i==0) 	next = pin.x*10+1;
			else 	next = pin.x*2;
			if (next == B) { System.out.println(pin.cnt+1); return;}
			else if(A<=next&&next<B&&!visited[next]) {		
					//System.out.println(pin.x + " "+pin.cnt);
					visited[next] = true;
					ret[next] = ret[pin.x];
					queue.add(new Pair(next,pin.cnt+1));
					
					
			}
		}
	}
	System.out.println("-1");
}

static class Pair {
    int x;
    int cnt;

    public Pair(int x, int cnt) {
        this.x=x;
        this.cnt=cnt;
    }
}
*/