package programmers.concatVsProduct;
// a+b와 2*a*b 중 더 큰 값 리턴. 같으면 a+b 리턴
public class Main {
	public static void main(String[] args) {
		System.out.println(solution(2,91));
	}
	public static int solution(int a, int b) {
		int concat = Integer.parseInt(String.valueOf(a) + b);
		int product = 2 * a * b;
		
		if(concat == product) {
			return concat;
		}
		return Math.max(concat, product);
	}
}
