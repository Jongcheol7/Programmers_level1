package coding;

public class Quiz36_WaterMelon {

	public static void main(String[] args) {
		Solution36 sol = new Solution36();
		sol.solution(5);
	}

}
class Solution36 {
    public String solution(int n) {
        String answer = "";
        
        for(int i=1; i<=n/2; i++) {
        	answer = answer + "����";
        }
        if(n%2 != 0) answer = answer + "��";
        
        System.out.println(answer);
        
        return answer;
    }
}