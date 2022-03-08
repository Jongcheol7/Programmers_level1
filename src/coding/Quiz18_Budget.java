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

		// 배열을 오름차순 정렬을하고 앞에서부터 더해야 가장 작은수부터 더하게 되므로 정해진 예산에서 가장 많은 부서들을 지원해줄 수 있다. 
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