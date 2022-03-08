package coding;

public class Quiz31_CountOfSpecificChar {

	public static void main(String[] args) {
		Solution31 sol = new Solution31();
		sol.solution("pPoooyY");
	}

}
class Solution31 {
    boolean solution(String s) {
        //y 89,121 p 80,112
        int y=0, p=0;
        
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i) == 89 || s.charAt(i) == 121) y++;
        	if(s.charAt(i) == 80 || s.charAt(i) == 112) p++;
        }
        
        return (y==p)?true:false;
    }
}