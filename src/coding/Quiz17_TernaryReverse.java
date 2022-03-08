package coding;

public class Quiz17_TernaryReverse {

	public static void main(String[] args) {
		Solution17 sol = new Solution17();
		sol.solution(45);
	}

}
class Solution17 {
    public int solution(int n) {   
    	// 문자열을 이용하여 나눈 나머지를 하나하나 뒤에 붙이면 거꾸로 입력된다.
        String sTernary = "";
        while(n > 0) {
        	sTernary += n%3;
        	n = n/3;
        }
        
        System.out.println(sTernary);
        // 문자열과 진법을 입력하면 그것을 10진법으로 바꿔준다.
        int nTernary = Integer.parseInt(sTernary, 3);
        System.out.println(nTernary);
        
        return nTernary;
    }
}