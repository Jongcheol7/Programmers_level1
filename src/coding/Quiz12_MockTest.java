package coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz12_MockTest {

	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[] answers = {3, 3, 2, 1, 1};
		sol.solution(answers);
	}

}
class Solution12 {
    public int[] solution(int[] answers) {
              
        int[][] patterns = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        int[] result = new int[patterns.length];
        
        // result라는 배열에 1번 2번 3번 학생의 맞은 갯수를 담는다.
        for(int p=0; p<patterns.length; p++) {
        	int count = 0;
        	for(int a=0; a<answers.length; a++) {
        		if(p == 0) {
        			if(answers[a] == patterns[p][a%5]) {
            			count++;
            		}
        		}else if(p == 1) {
        			if(answers[a] == patterns[p][a%8]) {
            			count++;
            		}
        		}else if(p == 2) {
        			if(answers[a] == patterns[p][a%10]) {
            			count++;
            		}
        		}        		
        	}
        	result[p] = count;
        }
        
        System.out.println(Arrays.toString(result));
        
        // 1,2,3번 학생중 가장 많이 맞은 사람의 맞은 갯수를 구한다.
        int max = Math.max(result[0], Math.max(result[1], result[2]));
        
        System.out.println(max);
        
        // arraylist에 학생의 
        List<Integer> list = new ArrayList<Integer>();
        
        int cnt1=0;
        for(int k=0; k<result.length; k++) {
        	
        	if(max != result[k]) {
        		cnt1++;
        		continue;
        	}else {
        		list.add(++cnt1);
        	}
        }
        
        int[] answer = new int[list.size()];
        int cnt2 = 0;
        for(int n : list) {
        	answer[cnt2++] = n;
        }
        Arrays.sort(answer);
                
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}