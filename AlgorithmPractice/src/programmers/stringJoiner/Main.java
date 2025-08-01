package programmers.stringJoiner;
// 문자들이 담겨있는 배열 arr 원소들을 순서대로 이어붙인 문자열을 리턴

public class Main {
	public static void main(String[] args) {
		String[] arr = {"a","b","c"};
		System.out.println(solution(arr));
	}
	
	public static String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for(String s : arr) {
        	sb.append(s);
        }
        return sb.toString();
    }
}

