package programmers.compareConcat;
<<<<<<< HEAD
//두 정수를 붙여서 더 큰 값 반환시키기
public class Main {
	public static void main(String[] args) {
		System.out.println(solution(33,914));
	}
	public static int solution(int a, int b){
		String ab = String.valueOf(a) + b; 
		String ba = String.valueOf(b) + a;
		// + 연산자에서 하나라도 문자열이면 나머지도 자동으로 문자열로 변환됨 
		// 둘다 숫자라면 덧셈이 되버리니깐,, 
		
		int num1 = Integer.parseInt(ab);
		int num2 = Integer.parseInt(ba);
		
		return Math.max(num1, num2);
	}
}
=======
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int c = a ;
        System.out.println(a + " + ");
        
        sc.close(); 
    }
}
>>>>>>> 740009f9cfb07e176b136fafb4c4a5ac99e7ff3d
