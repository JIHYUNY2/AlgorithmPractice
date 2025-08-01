package programmers.mergealternately;
//길이가 같은 두 문자열 str1, str2가 번갈아가면서 한번씩 등장하는 문자열을 만들어서 return
public class Main {
    public static void main(String[] args) {
        System.out.println(solution("aaaaa","bbbbb"));
    }

    public static String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str1.length(); i++) {
        	//두 문자열의 길이가 다르다면, 길이가 더 긴 나머지 부분을 붙이는 처리를 해줘야됨
        	sb.append(str1.charAt(i));
        	sb.append(str2.charAt(i));
        }
        return sb.toString();
    }
}