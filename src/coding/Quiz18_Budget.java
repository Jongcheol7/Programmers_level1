package coding;

import java.util.Arrays;

public class Quiz18_Budget {

	public static void main(String[] args) {
		Solution18 sol = new Solution18();
		int[] d = {1,3,2,5,4};
		sol.solution(d, 9);
	}

}
class Solution18 {
	public int solution(int[] d, int budget) {

		// �迭�� �������� �������ϰ� �տ������� ���ؾ� ���� ���������� ���ϰ� �ǹǷ� ������ ���꿡�� ���� ���� �μ����� �������� �� �ִ�. 
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));

		int cnt=0;
		int sum=0;
		for(int n : d) {
			sum += n;
			if(sum > budget) break;
			cnt++;
		}
		System.out.println(cnt);

		return cnt;
	}
}