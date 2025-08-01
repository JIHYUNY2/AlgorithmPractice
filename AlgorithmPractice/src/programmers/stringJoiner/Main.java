package programmers.stringJoiner;
// 문자들이 담겨있는 배열 arr 원소들을 순서대로 이어붙인 문자열을 리턴

public class Main {
	public static void main(String[] args) {
		String[] arr = {"a","b","c"};
		System.out.println(solution(arr));
	}
	
	public static String solution(String[] arr) {
		StringBuilder sb = new StringBuilder();
		// 문자열을 효율적으로 다루기 위한 도구, 반복문에서 문자열 누적할 때 많이 쓰임.
		for(String s : arr) {
		//for (int i = 0; i < arr.length; i++) 와 동일한 반복 수행
			sb.append(s);
		}
		return sb.toString();
	}
}
