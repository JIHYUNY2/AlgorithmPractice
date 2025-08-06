package programmers.commonMultiple;
//number, n, m이 주어졌을 때 n의 배수면서 m의 배수이면 1, 아니라면 0 리턴
public class Main {
	public static void main(String args[]) {
		System.out.println(solution(60, 2, 3));
	}
	public static int solution(int number, int n, int m) {
		if( number % n == 0 && number % m == 0 ) {
			return 1;
		} else {
			return 0;
		}
	}	
}
