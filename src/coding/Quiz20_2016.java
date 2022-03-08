package coding;

public class Quiz20_2016 {

	public static void main(String[] args) {
		Solution20 sol = new Solution20();
		sol.solution(5, 24);
	}

}
class Solution20 {
    public String solution(int a, int b) {
        
    	// �Ŵ� ���ϱ��� �ִ����� ������ �迭�� ��´�
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        // ���� �ϼ��� 1��1�Ϻ��� ���Ϥ����� ������ �����Ѵ�.
        int currentDay = 0;
        
        // 1���϶��� ���� �ϼ��� b�� �ȴ�.
        if(a == 1) {
        	currentDay = b;
        }
        // 2�����ʹ� �� ���� �ϼ��� ���ѰͿ� b�� ���Ѱ��� ���� �ϼ��̴�.
        if(a >= 2) {
        	for(int k=0; k<a-1; k++) {
        		currentDay += month[k];
            }
        	currentDay = currentDay + b;
        }
        System.out.println("firstday:"+currentDay);
        
        // ���� �� �ϼ����� 7�� ���� �������� 4�� ������ 7�� ���� �������� �׳� ������ �ȴ�.
        String answer = day[((currentDay%7)+4)%7];
        
        System.out.println(answer);
        
        return answer;
    }
}