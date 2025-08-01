package programmers.replacePartial;
/*s가 주어지면 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 
  문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수 작성 */
public class Main {
	public static void main(String[] args) {
		System.out.println(solution("He11oWor1d", "lloWorl", 2));
	}
	
    public static String solution(String my_string, String overwrite_string, int s) {
        String front = my_string.substring(0,s);
        String back = my_string.substring(s + overwrite_string.length());
        return front + overwrite_string + back;
    }
}

//public static String solution(String my_string, String overwrite_string, int s) {
//    String answer = "";
//    answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
//    return answer;
//}
