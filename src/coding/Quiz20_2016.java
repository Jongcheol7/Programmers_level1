package coding;

public class Quiz20_2016 {

	public static void main(String[] args) {
		Solution20 sol = new Solution20();
		sol.solution(5, 24);
	}

}
class Solution20 {
    public String solution(int a, int b) {
        
    	// 매달 몇일까지 있는지와 요일을 배열에 담는다
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        // 현재 일수가 1월1일부터 몇일쨰인지 변수를 선언한다.
        int currentDay = 0;
        
        // 1월일때는 현재 일수는 b가 된다.
        if(a == 1) {
        	currentDay = b;
        }
        // 2월부터는 각 월의 일수를 더한것에 b를 더한것이 현재 일수이다.
        if(a >= 2) {
        	for(int k=0; k<a-1; k++) {
        		currentDay += month[k];
            }
        	currentDay = currentDay + b;
        }
        System.out.println("firstday:"+currentDay);
        
        // 현재 총 일수에서 7로 나눈 나머지에 4를 더한후 7로 나눈 나머지가 그날 요일이 된다.
        String answer = day[((currentDay%7)+4)%7];
        
        System.out.println(answer);
        
        return answer;
    }
}