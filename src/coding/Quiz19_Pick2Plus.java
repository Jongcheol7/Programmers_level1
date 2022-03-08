package coding;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Quiz19_Pick2Plus {

	public static void main(String[] args) {
		Solution19 sol = new Solution19();
		int[] numbers = {2,1,3,4,1};
		sol.solution(numbers);
	}

}
class Solution19 {
    public int[] solution(int[] numbers) {

    	// 배열에서 2개의 수를 뽑아서 전부 더해야하는 경우의수를 생각하면
    	// 더해서 같은 값이 나올 수 있지만 중복을 제거하기 위해 set을 사용한다.
    	// 한번에 정렬까지 해주는 treeset을 이용해본다.
        Set<Integer> set = new TreeSet<>();
        for(int i=0; i<numbers.length-1; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		set.add(numbers[i] + numbers[j]);
        	}
        }
        System.out.println(set);
        
        // set을 배열로 전환한는 작업을 한다.
        Object[] a = set.toArray();
        int[] answer = new int[a.length];
        for(int n=0; n<a.length; n++) {
        	answer[n] = (int) a[n];
        }
        
        System.out.println(Arrays.toString(answer));
           
        return answer;
    }
}