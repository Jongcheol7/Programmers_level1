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
    	int sameNumber = 0; // ?΄ λ²νΈ?? ?΄μ²? λ²νΈ?? λͺκ°κ°? κ°μ?μ§?
    	int count_0 = 0;    // ?΄ λ²νΈ?? 0?΄ λͺκ°κ°? ??μ§?
    	int max_num = 0;    // ?΄ λ²νΈ 0?΄ ? λΆ? ?Ήμ²¨λ²?Έ?Ό κ²½μ° μ΄? λ§μ? κ°?? 
    	int min_num = 0;    // ?΄ λ²νΈ 0?΄ ? λΆ? ?Ήμ²¨λ²?Έ?? ?€λ₯? κ²½μ° μ΄? λ§μ? κ°??
    	int best;			// μ΅κ³  ?? ?±?
    	int worst;			// μ΅μ? ?? ?±?
    	
    	// ?΄κ°? λ‘λ λ²νΈ?? 0?΄ λͺκ°κ°? ??μ§? ??Έ?? λ©μ?
    	for(int i=0; i<6; i++) {
    		if(lottos[i] == 0) {
    			count_0++;
    		}
    	}

    	// 0? κ°??? ?°?° ?Ήμ²¨λ²?Έ?? λͺκ°κ°? λ§λμ§? μ΅λ? μ΅μκ°? ?μΈ?
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
    	    
    	// ?±?? 7?? λͺκ°κ°? κ°μ?μ§? λΊ΄λ©΄ ??¨?€. ?λ₯Όλ€?΄ 6κ°κ? ? λΆ? λ§μλ²λ¦¬λ©? 7-6?Όλ‘? 1?±?΄ ??€.
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
    
    // ?΄ λ²νΈ? 0?΄ ??μ§? ?κ΄???΄ ?Ήμ²¨λ²?Έ?? λͺκ°κ°? λ§λμ§? ??Έ?? λ©μ?
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

// ΔΪ΅ε ΌφΑ€
/*
ΐΜΑί ΖχΉ?ΐΈ·Ξ ΗΡΉψΏ‘ 0ΐΗ °ΉΌφΏΝ ΈΒΘω°ΉΌφΈ¦ ΎΛΎΖ³½΄Ω
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
rankΆσ΄Β ΗΤΌφΈ¦ ΈΈ΅ιΎξΌ­ ½Ίΐ§Δ‘ΔΙΐΜ½Ί·Ξ ΅ξΌφΈ¦ Έ?ΕΟΗΨΑΦ΄Β °Νΐ» ΈΈ΅η΄Ω.
*/