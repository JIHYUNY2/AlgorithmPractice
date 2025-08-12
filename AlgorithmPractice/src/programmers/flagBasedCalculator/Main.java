package programmers.flagBasedCalculator;
//flag가 true면 a+b , false면 a-b
public class Main {
	public static void main(String[] args) {
		System.out.println(solution(2,3,true)); // 5
		System.out.println(solution(2,3,false)); // -1
		System.out.println(solution(-5,10,true)); // 5
	}
	public static int solution (int a, int b, boolean flag) {
		return flag ? a + b : a - b;
	}
}
