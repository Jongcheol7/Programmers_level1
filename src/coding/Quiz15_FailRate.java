package coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz15_FailRate {

	public static void main(String[] args) {
		Solution15 sol = new Solution15();
		int n = 5;
		int[] stages = {2,1,2,6,2,4,3,3};
		// 3,4,2,1,5
		sol.solution(n, stages);
	}

}
class Solution15 {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        
        // �迭�� ArrayList�� ��ƺ���
        List<Integer> arrayListStages = new ArrayList<Integer>();
        int cnt1 = 0;
        for(int a : stages) {
        	arrayListStages.add(cnt1++, a);
        }
        
        // ���� ����� �������� ���ϱ�
        int max = 0;
        for(int i : stages) {
        	if(max < i) {
        		max = i;
        	}
        }
        System.out.println(max);
        
        double[] ratePerLevel = new double[max];
        int restPeople = arrayListStages.size(); 
        for(int s=1; s<=max; s++) {
        	if(s==1) {
        		ratePerLevel[s-1] = countPerLevel(s, stages) / restPeople;
        	}
        	ratePerLevel[s-1] = countPerLevel(s, stages) / restPeople(countPerLevel(s-1, stages), restPeople);
        }
        
        System.out.println(Arrays.toString(ratePerLevel));
        
        return answer;
    }
    
    // �� ������ �����ϴ� ����� ��
    public int countPerLevel(int level, int[] stages) {
    	int count = 0;
    	for(int i=0; i<stages.length; i++) {
    		if(stages[i] == level) {
    			count++;
    		}
    	}
    	return count;
    }
    
    // ���� ������������ ���� �� �ο��� ��
    public int restPeople(int prevLevelPeople, int restPeople) {
    	return restPeople -= prevLevelPeople;
    }
}