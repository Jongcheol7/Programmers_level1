package coding;

public class Quiz03_ConvertNumberWords {

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int result = sol.solution("one4seveneight");
		System.out.println(result);
	}

}
class Solution3 {
    public int solution(String s) {
    	
    	String[] eng = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    	for(int i=0; i<eng.length; i++) {
    		s = s.replace(eng[i], Integer.toString(i));
    	}
        return Integer.parseInt(s);
    }
}