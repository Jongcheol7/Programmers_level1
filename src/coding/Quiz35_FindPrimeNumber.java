package coding;

public class Quiz35_FindPrimeNumber {

	public static void main(String[] args) {
		Solution35 sol = new Solution35();
		sol.solution(30);
	}

}
class Solution35 {
    public int solution(int n) {        
        int cnt = 0;
        if(n<=10) {
        	for(int i=2; i<=n; i++) {
        		if(i==2 || i==3 || i==5 || i==7) cnt++;
        	}
        }else {
        	cnt = 4;
        	for(int i=11; i<=n; i++) {
            	if(i%2==0 || i%3==0 || i%5==0 || i%7==0) continue;
            	else cnt++;
            }
        }
        
        System.out.println(cnt);
        return cnt;
    }
}