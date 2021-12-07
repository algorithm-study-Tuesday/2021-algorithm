import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ11000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] times = new int[N][2];
        for (int i = 0; i < N; i++) {
            times[i][0] = scan.nextInt(); //Si
            times[i][1] = scan.nextInt(); //Ti
        }
     
        Arrays.sort(times, (o1, o2) -> {
            if (o1[0] == o2[0]) return o1[1] - o2[1]; //같은 시작시간일 경우 빨리 끝나는 순서로(끝나는시간오름차순)
            else return o1[0] - o2[0]; //시작시간 순 정렬
        });
      
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int start = times[i][0];
            int end = times[i][1];
            if (!queue.isEmpty() && queue.peek() <= start) { // 시작시간이 일찍 끝나는 시간보다 같거나 크다면 기존 강의실 이용
                queue.poll();
            }
            queue.offer(end);
        }
        System.out.println(queue.size());
    }
	

}
