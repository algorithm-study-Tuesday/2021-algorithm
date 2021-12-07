import java.util.*;
import java.io.*;

public class BOJ21608 {
	static int n, result;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer stk;
    	n = stoi(br.readLine());

    	int size = (int) Math.pow(n, 2);

    	ArrayList<Set<Integer>> like = new ArrayList<>();
    	for(int i = 0; i <= size; i++)
    		like.add(new HashSet<Integer>());

    	// 조건 값 세팅
    	int idx;
    	int[] order = new int[size];
    	for(int i = 0; i < size; i++) {
    		stk = new StringTokenizer(br.readLine());
    		idx = stoi(stk.nextToken());
    		order[i] = idx;
    		for(int j = 0; j < 4; j++) {
    			like.get(idx).add(stoi(stk.nextToken()));
    		}
    	}

    	int[][] sit = new int[n][n];

    	int[] dy = {-1,1,0,0};
    	int[] dx = {0,0,-1,1};

    	int y,x, score = 0, maxS, ty = -1, tx = -1;
    	// 학생의 순서대로 한명씩 좌석에 배치한다
    	for(idx = 0; idx < size; idx++) {
    		maxS = -1;		// 처음 비교 값을 -1로 하여, 나중에 인접한 좋은 학생이 0명일 때를 대비한다.
    		// 0,0 부터 n-1, n-1까지 탐색한다.
    		for(int i = 0; i < n; i++) {
    			for(int j = 0; j < n; j++) {
    				if(sit[i][j] != 0)
    					continue;

    				score = 0;
    				// 현재 좌석의 상 하 좌 우를 탐색하여 점수를 매긴다.
    				for(int k = 0; k < 4; k++) {
    					y = i + dy[k];
    					x = j + dx[k];
    					// 해당하는 좌석에 선호하는 학생이 있으면
    					if(isIn(y,x) && like.get(order[idx]).contains(sit[y][x]))
    						score += 5;
    					else if(isIn(y,x) && sit[y][x] == 0)
    						score += 1;
    				}
					// 해당 좌석의 점수가 높으면, 차후에 그 위치에 배치하도록 위치를 저장한다.
    				if(score > maxS) {
    					ty = i;
    					tx = j;
    					maxS = score;
    				}
    			}
    		}

    		sit[ty][tx] = order[idx];
    	}

    	int result = 0, cnt;
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n; j++) {
    			cnt = 0;

    			for(int k = 0; k < 4; k++) {
					y = i + dy[k];
					x = j + dx[k];
					// 각 좌석의 상하좌우에 선호하는 학생이 앉아 있으면
					if(isIn(y,x) && like.get(sit[i][j]).contains(sit[y][x])) {
						cnt++;
					}
    			}
    			// 인접한 학생의 수가 0이면, 10^-1이 0.1이다.
    			if(cnt != 0)
    				result += (int) Math.pow(10, cnt - 1);
    		}
    	}

    	System.out.println(result);

    	br.close();
	}

	// 주어진 범위 안에 있는가
    public static boolean isIn(int y, int x){
        if(y < 0 || y >= n || x < 0 || x >= n)
            return false;
        return true;
    }

	static int stoi(String str) {
    	return Integer.parseInt(str);
    }
}


//https://taxol1203.github.io/codingtest/bj-%EC%83%81%EC%96%B4-%EC%B4%88%EB%93%B1%ED%95%99%EA%B5%90/#%EC%BD%94%EB%93%9C