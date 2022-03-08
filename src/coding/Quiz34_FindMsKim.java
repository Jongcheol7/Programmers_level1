package coding;

public class Quiz34_FindMsKim {

	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		sol.solution(new String[] {"Jane", "Kim"});
	}

}
class Solution34 {
    public String solution(String[] seoul) {
     
        int cnt = 0;
        for(int i=0; i<seoul.length; i++) {
        	if(seoul[i].equals("Kim")) break;
        	cnt ++;
        }
        System.out.println(cnt);
        return "김서방은" +cnt+ "에 있다";
    }
}