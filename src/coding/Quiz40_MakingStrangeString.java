package coding;

import java.util.Arrays;

public class Quiz40_MakingStrangeString {

	public static void main(String[] args) {
		Solution40 sol = new Solution40();
		sol.solution("try hello world");
	}

}
class Solution40 {
    public String solution(String s) {
        String answer = "";
        
        // 마지막 단어 뒤에 공백 붙이기
//        s = s.concat(" ");
//        System.out.println(s);
        
        // 공백을 기준으로 단어 구분해 배열에 담기
        String[] arrayS = s.split("\\s");
        
        System.out.println(Arrays.toString(arrayS));
        
        for(int i=0; i<arrayS.length; i++) {
        	for(int k=0; k<arrayS[i].length(); i++) {
        		if(k%2 == 1) {
        			arrayS[i].replace(arrayS[i].charAt(k), (char)(arrayS[i].charAt(k)+32));
        		}else {
        			arrayS[i].replace(arrayS[i].charAt(k), (char)(arrayS[i].charAt(k)-32));
        		}
        	}
        }
        
//        System.out.println(arrayS[0]);
//        System.out.println((char)(arrayS[0].charAt(2)-32));
        
        
        System.out.println(Arrays.toString(arrayS));
        
        return answer;
    }
}