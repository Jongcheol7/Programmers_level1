package coding;

import java.util.Set;
import java.util.TreeSet;

public class Quiz28_ArrayOfDivicedNumbers {

	public static void main(String[] args) {
		Solution28 sol = new Solution28();
		sol.solution(new int[] {5,9,7,10}, 5);
	}

}
class Solution28 {
    public int[] solution(int[] arr, int divisor) {
        
        Set<Integer> set = new TreeSet<Integer>();
        
        for(int i : arr) {
        	if(i%divisor == 0) {
        		set.add(i);
        	}
        }
        if(set.size() == 0){
            set.add(-1);
        }
        System.out.println(set);
        
        Object[] tmp = set.toArray();
        
        int[] answer = new int[tmp.length];
        int cnt = 0;
        for(Object a : tmp) {
        	answer[cnt++] = (int)a;
        }
        
        return answer;
    }
}