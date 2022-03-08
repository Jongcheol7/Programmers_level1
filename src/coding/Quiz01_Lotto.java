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
    	int sameNumber = 0; // ?‚´ ë²ˆí˜¸?? ?‹´ì²? ë²ˆí˜¸?? ëª‡ê°œê°? ê°™ì?ì§?
    	int count_0 = 0;    // ?‚´ ë²ˆí˜¸?—?„œ 0?´ ëª‡ê°œê°? ?ˆ?Š”ì§?
    	int max_num = 0;    // ?‚´ ë²ˆí˜¸ 0?´ ? „ë¶? ?‹¹ì²¨ë²ˆ?˜¸?¼ ê²½ìš° ì´? ë§ì? ê°??ˆ˜ 
    	int min_num = 0;    // ?‚´ ë²ˆí˜¸ 0?´ ? „ë¶? ?‹¹ì²¨ë²ˆ?˜¸?? ?‹¤ë¥? ê²½ìš° ì´? ë§ì? ê°??ˆ˜
    	int best;			// ìµœê³  ?˜ˆ?ƒ ?“±?ˆ˜
    	int worst;			// ìµœì? ?˜ˆ?ƒ ?“±?ˆ˜
    	
    	// ?‚´ê°? ë¡œë˜ ë²ˆí˜¸?—?„œ 0?´ ëª‡ê°œê°? ?ˆ?Š”ì§? ?™•?¸?•˜?Š” ë©”ì„œ?“œ
    	for(int i=0; i<6; i++) {
    		if(lottos[i] == 0) {
    			count_0++;
    		}
    	}

    	// 0?˜ ê°??ˆ˜?— ?”°?”° ?‹¹ì²¨ë²ˆ?˜¸?? ëª‡ê°œê°? ë§ëŠ”ì§? ìµœë? ìµœì†Œê°? ?˜ˆì¸?
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
    	    
    	// ?“±?ˆ˜?Š” 7?—?„œ ëª‡ê°œê°? ê°™ì?ì§? ëº´ë©´ ?‚˜?˜¨?‹¤. ?˜ˆë¥¼ë“¤?–´ 6ê°œê? ? „ë¶? ë§ì•„ë²„ë¦¬ë©? 7-6?œ¼ë¡? 1?“±?´ ?œ?‹¤.
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
    
    // ?‚´ ë²ˆí˜¸?— 0?´ ?ˆ?Š”ì§? ?ƒê´??—†?´ ?‹¹ì²¨ë²ˆ?˜¸?? ëª‡ê°œê°? ë§ëŠ”ì§? ?™•?¸?•˜?Š” ë©”ì„œ?“œ
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

// ÄÚµå ¼öÁ¤
/*
ÀÌÁß Æ÷¹®À¸·Î ÇÑ¹ø¿¡ 0ÀÇ °¹¼ö¿Í ¸ÂÈù°¹¼ö¸¦ ¾Ë¾Æ³½´Ù
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
rank¶ó´Â ÇÔ¼ö¸¦ ¸¸µé¾î¼­ ½ºÀ§Ä¡ÄÉÀÌ½º·Î µî¼ö¸¦ ¸®ÅÏÇØÁÖ´Â °ÍÀ» ¸¸µç´Ù.
*/