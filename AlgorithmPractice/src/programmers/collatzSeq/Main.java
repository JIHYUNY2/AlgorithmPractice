package programmers.collatzSeq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(10)));
		System.out.println(Arrays.toString(solution(8)));
	}
	public static int[] solution(int n) {
		List<Integer> list = new ArrayList<>();
		// 처음 숫자 리스트에 저장 (10, 8)
		list.add(n);
		// n이 1이 아닐 때 짝수, 홀수 처리
		while(n != 1) {
			if(n % 2 == 0) {
				n /= 2;
			} else{
				n = 3 * n + 1;
			}
			list.add(n);
		}
		// 만들어진 리스트를 배열로 만들어서 리턴
		// list는 수열 길이를 예측할 수 없어 동적으로 저장하기 위해 쓰고, 배열은 성능과 메모리 효율을 위해 최종 반환용으로 변환해서 사용
		int[] ans = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}
}
