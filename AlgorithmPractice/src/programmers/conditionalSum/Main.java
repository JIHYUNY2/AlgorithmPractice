package programmers.conditionalSum;
//n이 홀수면 n이하 홀수의 모든 정수의 합, n이 짝수면 n이하 짝수의 모든 정수 제곱의 합 리턴
public class Main {
	public static void main(String args[]) {
		System.out.print(solution(10));
	}
	public static int solution(int n) {
		int num = 0;
		if(n % 2 == 0) { //짝수인 경우 : 짝수 제곱의 합
			for(int i = 2; i <= n; i+=2) {
				num += i * i;
			}
		} else { //홀수인 경우 : 홀수의 합
			for(int i = 1; i <= n; i+=2) {
				num += i;
			}
		}
		return num;
	}
}
