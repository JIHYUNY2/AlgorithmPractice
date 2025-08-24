package programmers.countUp;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3,10))); // [3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println(Arrays.toString(solution(5, 5))); // [5]
	}
	
	/**
     * start_num부터 end_num까지 1씩 증가하는 배열을 반환
     */
	public static int[] solution(int start_num, int end_num) {
		int n = end_num - start_num + 1;
		int[] arr = new int[n];
		// start_num 에서 i를 더해서 1씩 증가하는 배열 만들기
		for(int i = 0; i < n; i++) {
			arr[i] = start_num + i;
		}
		return arr;
	}
}
