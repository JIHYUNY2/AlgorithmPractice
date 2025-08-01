package programmers.rotateStringPrinter;
import java.util.Scanner;
//문자열을 시계방향으로 90도 돌려서 출력하기
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //한줄 전체를 읽음
        
        for(int i=0 ; i < str.length() ; i++) {
        	System.out.println(str.charAt(i));
        }
                
//        String str2 = sc.next(); //공백 이전까지만 읽음
//        
//        for (int i = 0; i < str2.length(); i++) {
//        	System.out.println(str2.toCharArray()[i]); //문자열 전체를 배열로 변환 후 접근
//        }        
        sc.close();
    }
}
