package coding;

public class Quiz33_HandleString {

	public static void main(String[] args) {
		Solution33 sol = new Solution33();
		sol.solution("1234");
	}

}
class Solution33 {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length()!= 4 && s.length()!=6) answer = false;
        System.out.println(answer);
        
        //�ѱ��� �ѱ��� ���ذ��鼭 �ƽ�Ű�ڵ� 48, 57 ���̰� �ƴϸ� false
        for(int i=0; i<s.length(); i++) {
        	if(!(s.charAt(i) >= 48 && s.charAt(i) <= 57)) answer = false;
        }
  
        System.out.println(answer);
        
        return answer;
    }
}