package programmers.evenOddPrinter;
import java.util.Scanner;
//자연수 n을 입력했을 때 짝수면 n is even, 홀수면 n is odd 출력하기
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println(n + " is even");
		} else {
			System.out.println(n + " is odd");
		}
		
		sc.close();
	}
}
