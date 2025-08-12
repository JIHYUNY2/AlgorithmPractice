package programmers.inequality;
// ineq은 </> , eq는 =/! 중 하나임. n과 m이 주어질 때 조건에 맞으면 1, 아니면 0 리턴
public class Main {
	public static void main(String args[]) {
		System.out.println(solution(">", "=", 5, 3));
		System.out.println(solution("<", "!", 5, 5));  // 0 (5 < 5는 거짓)
        System.out.println(solution("<", "=", 3, 3));  // 1 (3 <= 3)
        System.out.println(solution(">", "!", 2, 7));  // 0 (2 > 7 거짓)
	}
	public static int solution(String ineq, String eq, int n, int m) {
		boolean result;
		if(ineq.equals("<")) {
			result = eq.equals("=") ? n <= m : n < m; 
		} else {
			result = eq.equals("=") ? n >= m : n > m;
		}
		return result ? 1 : 0 ;
	}
}
