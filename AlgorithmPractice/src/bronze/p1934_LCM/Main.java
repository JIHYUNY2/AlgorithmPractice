package bronze.p1934_LCM;
import java.util.Scanner;  

public class Main {  
    /**
     * 최대공약수(GCD)를 구하는 함수
     * 유클리드 호제법 사용: GCD(a, b) = GCD(b, a % b)
     */
    public static int gcd(int a, int b) {
        while (b != 0) {          // b가 0이 될 때까지 반복
            int tmp = a % b;      // a를 b로 나눈 나머지를 구함
            a = b;                // a에 b를 대입
            b = tmp;              // b에 나머지를 대입
        }
        return a;  // b가 0이 되면 a가 최대공약수
    }

    /**
     * 최소공배수(LCM)를 구하는 함수
     * LCM(a, b) = (a * b) / GCD(a, b)
     */
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        int T = sc.nextInt();  // 테스트 케이스 개수 입력 받기

        // 각 테스트 케이스마다 A와 B를 입력받아 LCM을 계산
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();  
            int B = sc.nextInt(); 
            System.out.println(lcm(A, B));  // 최소공배수 출력
        }
    }
}
