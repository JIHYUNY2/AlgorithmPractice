package programmers.repeat;
//문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수 만들기
public class Main {
	public static void main(String[] args) {
		System.out.println(solution("string", 3));
	}
	
	public static String solution(String my_string, int k) {
		return my_string.repeat(k);

/*		StringBuilder result = new StringBuilder();
	    for (int i = 0; i < k; i++) {
	        result.append(my_string);
	    }
	    return result.toString();
*/    
/*		for(int i = 0; i < k ; i++) {
			System.out.print(my_string);
		}
		return my_string;
*/
	}
}
