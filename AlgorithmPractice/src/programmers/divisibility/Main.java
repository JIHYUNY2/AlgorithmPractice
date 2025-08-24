package programmers.divisibility;

public class Main {
	public static void main(String[] args) {
        System.out.println(solution(98, 2));   // 출력:1
        System.out.println(solution(34, 3));   // 출력:0
    }

    public static int solution(int num, int n) {
        return (num % n == 0) ? 1 : 0;
    }
}
