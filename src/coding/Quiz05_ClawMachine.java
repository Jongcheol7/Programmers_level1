package coding;

import java.util.ArrayList;

public class Quiz05_ClawMachine {
	
	public static void main(String[] args) {
		
		Solution5 sol = new Solution5();
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		sol.solution(board, moves);
	}
}
class Solution5 {
    public int solution(int[][] board, int[] moves) {
    	// 뽑은 인형을 저장하는 곳
    	ArrayList result = new ArrayList();
    	int answer = 0;
    	
    	// 총 몇번 뽑을지
    	for(int move=0; move<moves.length; move++) {
    		// 몇번째에서 뽑을지, 그리고 그 번째에서 0의 여부에 따라 결과가 다름
    		for(int i=0; i<board.length; i++) {
        		if(board[i][moves[move]-1] == 0) {
        			continue;
        		}else {
        			result.add(board[i][moves[move]-1]);
        			board[i][moves[move]-1] = 0;
        			break;
        		}
        	}
    		// 뽑힌 인형들중 같은 것이 2개이면 2개가 터져서 +2점 획득
    		for(int a=1; a<result.size(); a++) {
    			if(result.get(a) == result.get(a-1)) {
    				result.remove(a);
    				result.remove(a-1);
    				answer+=2;
    			}
    		}
    	}
    	System.out.println(answer);
        return answer;
    }
}