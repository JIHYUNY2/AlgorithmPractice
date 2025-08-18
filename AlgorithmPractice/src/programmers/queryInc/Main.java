package programmers.queryInc;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
        System.out.println(Arrays.toString(solution(arr, queries))); // [2, 3, 4, 6, 4]
    }

    /**
     * 각 쿼리 [s, e, k]에 대해 s ≤ i ≤ e 이고 i % k == 0 인 인덱스 i에 대해 arr[i]를 1 증가시킨다.
     * 모든 쿼리 적용 후의 arr를 반환한다.
     */
	public static int[] solution(int[] arr, int[][] queries) {
		for(int[] q : queries) {
			int s = q[0], e = q[1], k = q[2];
			for (int i = s; i <= e; i++) { // s부터 e까지
				if(i % k == 0) {           // i가 k의 배수이면
					arr[i] += 1;           // 그 칸에 +1
				}
			}
		}
		return arr;
	}
}
