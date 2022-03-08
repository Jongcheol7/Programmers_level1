package coding;

import java.util.Arrays;

public class Quiz01_Lotto {
	
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		int[] lottos = {45,4,0,20,3,9};
		int[] win_nums = {20,9,3,45,4,35};
		int[] result = sol.solution(lottos, win_nums);
		System.out.println(Arrays.toString(result));
	}
	
}

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
    	int sameNumber = 0; // ?�� 번호?? ?���? 번호?? 몇개�? 같�?�?
    	int count_0 = 0;    // ?�� 번호?��?�� 0?�� 몇개�? ?��?���?
    	int max_num = 0;    // ?�� 번호 0?�� ?���? ?��첨번?��?�� 경우 �? 맞�? �??�� 
    	int min_num = 0;    // ?�� 번호 0?�� ?���? ?��첨번?��?? ?���? 경우 �? 맞�? �??��
    	int best;			// 최고 ?��?�� ?��?��
    	int worst;			// 최�? ?��?�� ?��?��
    	
    	// ?���? 로또 번호?��?�� 0?�� 몇개�? ?��?���? ?��?��?��?�� 메서?��
    	for(int i=0; i<6; i++) {
    		if(lottos[i] == 0) {
    			count_0++;
    		}
    	}

    	// 0?�� �??��?�� ?��?�� ?��첨번?��?? 몇개�? 맞는�? 최�? 최소�? ?���?
    	switch(count_0) {
    		case 0:
    			sameNumber = compare(lottos, win_nums);
    			max_num = sameNumber;
    			min_num = sameNumber;
    			break;
    		case 1:
    			sameNumber = compare(lottos, win_nums);
    			max_num = sameNumber + 1;
    			min_num = sameNumber + 0;
    			break;
    		case 2:
    			sameNumber = compare(lottos, win_nums);
    			max_num = sameNumber + 2;
    			min_num = sameNumber + 0;
    			break;
    		case 3:
    			sameNumber = compare(lottos, win_nums);
    			max_num = sameNumber + 3;
    			min_num = sameNumber + 0;
    			break;
    		case 4:
    			sameNumber = compare(lottos, win_nums);
    			max_num = sameNumber + 4;
    			min_num = sameNumber + 0;
    			break;
    		case 5:
    			sameNumber = compare(lottos, win_nums);
    			max_num = sameNumber + 5;
    			min_num = sameNumber + 0;
    			break;
    		case 6:
    			max_num = 6;
    			min_num = 0;
    			break;
    		default:
    			break;
    	}
    	    
    	// ?��?��?�� 7?��?�� 몇개�? 같�?�? 뺴면 ?��?��?��. ?��를들?�� 6개�? ?���? 맞아버리�? 7-6?���? 1?��?�� ?��?��.
    	best = 7 - max_num;
    	worst = 7 - min_num;
    	if(max_num == 0){
            best = 6;
        }
        if(min_num == 0){
            worst = 6;
        }
            	    	
    	
        int[] answer = {best, worst};
        return answer;
    }
    
    // ?�� 번호?�� 0?�� ?��?���? ?���??��?�� ?��첨번?��?? 몇개�? 맞는�? ?��?��?��?�� 메서?��
    public int compare(int[] lottos, int[] win_nums) {
    	int count = 0;
		for(int i=0; i<6; i++) {
    		for(int j=0; j<6; j++) {
    			if(lottos[i] == win_nums[j]) {
    				count++;
    			}
    		}
    	}
		return count;
	}
}

// �ڵ� ����
/*
���� �������� �ѹ��� 0�� ������ ���������� �˾Ƴ���
for(int a : lottos){
	if(a == 0) cnt0++;
	else{
		for(int b : wins){
			if(a == b) cnt++;
		}
	}
}
answer[0] = rank(cnt0 + cnt);
answer[1] = rank(cnt);
rank��� �Լ��� ���� ����ġ���̽��� ����� �������ִ� ���� �����.
*/