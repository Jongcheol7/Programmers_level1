package coding;

import java.util.Arrays;

public class Quiz04_PressKeypad {
	
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		sol.solution(new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left");
		
		
	}

}
class Solution4 {
    public String solution(int[] numbers, String hand) {
    	
    	String result = "";
    	String[] resultArray = new String[numbers.length];
//    	int lastIndexL = Arrays.asList(resultArray).lastIndexOf("L");
//    	int lastIndexR = Arrays.asList(resultArray).lastIndexOf("R");
//    	if( lastIndexL == -1) {
//    		lastIndexL = 0;
//    	}
//    	if( lastIndexR == -1) {
//    		lastIndexR = 0;
//    	}
    	
    	for(int i=0; i<numbers.length; i++) {
    		if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
    			result = result.concat("L");
    			resultArray[i] = "L";
    		}else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
    			result = result.concat("R");
    			resultArray[i] = "R";
    		}
    		
    		
    		
    		else if(numbers[i] == 8) {
    			if( (Math.abs( numbers[i] - getL(resultArray, numbers) ) == 1 ||
    					Math.abs( numbers[i] - getL(resultArray, numbers) ) == 3 ||
    					Math.abs( numbers[i] - getL(resultArray, numbers) ) == 8)
    					&&
    				(Math.abs( numbers[i] - getR(resultArray, numbers) ) == 1 ||
    					Math.abs( numbers[i] - getR(resultArray, numbers) ) == 3 ||
    					Math.abs( numbers[i] - getL(resultArray, numbers) ) == 8)
    				){
    				if(hand == "right") {
    					result = result.concat("R"); 
        				resultArray[i] = "R";
    				}else {
    					result = result.concat("L"); 
        				resultArray[i] = "L";
    				}
    			}else if(Math.abs( numbers[i] - getL(resultArray, numbers) ) == 1 ||
    					Math.abs( numbers[i] - getL(resultArray, numbers) ) == 3 ||
    					Math.abs( numbers[i] - getL(resultArray, numbers) ) == 8) { 
    				result = result.concat("L"); 
    				resultArray[i] = "L";
    			}else if(Math.abs( numbers[i] - getR(resultArray, numbers) ) == 1 ||
    					Math.abs( numbers[i] - getR(resultArray, numbers) ) == 3 ||
    					Math.abs( numbers[i] - getL(resultArray, numbers) ) == 8) { 
    				result = result.concat("R"); 
    				resultArray[i] = "R";
    			}else {
    				if(getR(resultArray, numbers) == 0 || getL(resultArray, numbers) == 0) {
    					if(Math.abs( numbers[i] - getR(resultArray, numbers)) > Math.abs( numbers[i] - getL(resultArray, numbers)) ) {
        					result = result.concat("R"); 
            				resultArray[i] = "R";
        				}else {
        					result = result.concat("L"); 
            				resultArray[i] = "L";
        				}
    				}
    				
    				if(Math.abs( numbers[i] - getR(resultArray, numbers)) > Math.abs( numbers[i] - getL(resultArray, numbers)) ) {
    					result = result.concat("L"); 
        				resultArray[i] = "L";
    				}else {
    					result = result.concat("R"); 
        				resultArray[i] = "R";
    				}
    			}
    		}
    		
    		
    		
    		
    		else if(numbers[i] == 0 || numbers[i] == 2 || numbers[i] == 5) {
    			if( (Math.abs( numbers[i] - getL(resultArray, numbers) ) == 1 ||
    					Math.abs( numbers[i] - getL(resultArray, numbers) ) == 3)
    					&&
    				(Math.abs( numbers[i] - getR(resultArray, numbers) ) == 1 ||
    					Math.abs( numbers[i] - getR(resultArray, numbers) ) == 3)
    				){
    				if(hand == "right") {
    					result = result.concat("R"); 
        				resultArray[i] = "R";
    				}else {
    					result = result.concat("L"); 
        				resultArray[i] = "L";
    				}
    			}		
    			else if(Math.abs( numbers[i] - getL(resultArray, numbers) ) == 1 ||
    					Math.abs( numbers[i] - getL(resultArray, numbers) ) == 3	) { 
    				result = result.concat("L"); 
    				resultArray[i] = "L";
    			}else if(Math.abs( numbers[i] - getR(resultArray, numbers) ) == 1 ||
    					Math.abs( numbers[i] - getR(resultArray, numbers) ) == 3	) { 
    				result = result.concat("R"); 
    				resultArray[i] = "R";
    			}else {
    				if(getR(resultArray, numbers) == 0 || getL(resultArray, numbers) == 0) {
    					if(Math.abs( numbers[i] - getR(resultArray, numbers)) > Math.abs( numbers[i] - getL(resultArray, numbers)) ) {
        					result = result.concat("R"); 
            				resultArray[i] = "R";
        				}else {
        					result = result.concat("L"); 
            				resultArray[i] = "L";
        				}
    				}
    				
    				if(Math.abs( numbers[i] - getR(resultArray, numbers)) > Math.abs( numbers[i] - getL(resultArray, numbers)) ) {
    					result = result.concat("L"); 
        				resultArray[i] = "L";
    				}else {
    					result = result.concat("R"); 
        				resultArray[i] = "R";
    				}
    			}
    		}
    		
    		
    		
    		
//    		else if(numbers[i] == 0 || numbers[i] == 2 || numbers[i] == 5 || numbers[i]== 8) {
//    			if( (Math.abs( numbers[i] - numbers[Arrays.asList(resultArray).lastIndexOf("L")] ) == 1 ||
//    					Math.abs( numbers[i] - numbers[Arrays.asList(resultArray).lastIndexOf("L")] ) == 3)
//    					&&
//    				(Math.abs( numbers[i] - numbers[Arrays.asList(resultArray).lastIndexOf("R")] ) == 1 ||
//    					Math.abs( numbers[i] - numbers[Arrays.asList(resultArray).lastIndexOf("R")] ) == 3)
//    				){
//    				if(hand == "right") {
//    					result = result.concat("R"); 
//        				resultArray[i] = "R";
//    				}else {
//    					result = result.concat("L"); 
//        				resultArray[i] = "L";
//    				}
//    			}
//    			else if(Math.abs( numbers[i] - numbers[Arrays.asList(resultArray).lastIndexOf("L")] ) == 1 ||
//    					Math.abs( numbers[i] - numbers[Arrays.asList(resultArray).lastIndexOf("L")] ) == 3	) { 
//    				result = result.concat("L"); 
//    				resultArray[i] = "L";
//    			}else if(Math.abs( numbers[i] - numbers[Arrays.asList(resultArray).lastIndexOf("R")] ) == 1 ||
//    					Math.abs( numbers[i] - numbers[Arrays.asList(resultArray).lastIndexOf("R")] ) == 3	) { 
//    				result = result.concat("R"); 
//    				resultArray[i] = "R";
//    			}
//    		}
    		
    		
    		
    		
    	}
    	
    	System.out.println(Arrays.toString(numbers));
    	System.out.println(Arrays.toString(resultArray));
    	System.out.println(result);
    	
        
        return result;
    }
    
    public int getL(String[] resultArray, int[] numbers) {
    	int lastIndexL;
    	if( Arrays.asList(resultArray).lastIndexOf("L") == -1) {
    		lastIndexL = 0;
    	}else {
    		lastIndexL = numbers[Arrays.asList(resultArray).lastIndexOf("L")];
    	}
    	return lastIndexL;
    }
    public int getR(String[] resultArray, int[] numbers) {
    	int lastIndexR;
    	if( Arrays.asList(resultArray).lastIndexOf("R") == -1) {
    		lastIndexR = 0;
    	}else {
    		lastIndexR = numbers[Arrays.asList(resultArray).lastIndexOf("R")];
    	}
    	return lastIndexR;
    }
}

/*
  else if(numbers[i] == 0 || numbers[i] == 2 || numbers[i] == 5 || numbers[i]
  == 8){ if(Math.abs( numbers[i] -
  numbers[Arrays.asList(resultArray).lastIndexOf("L")] ) < Math.abs( numbers[i]
  - numbers[Arrays.asList(resultArray).lastIndexOf("R")] ) ) { result =
  result.concat("L"); resultArray[i] = "L"; }else if(Math.abs( numbers[i] -
  numbers[Arrays.asList(resultArray).lastIndexOf("L")] ) == Math.abs(
  numbers[i] - numbers[Arrays.asList(resultArray).lastIndexOf("R")] ) ) {
  if(hand == "right") { result = result.concat("R"); resultArray[i] = "R";
  }else { result = result.concat("L"); resultArray[i] = "L"; }
  
  }else { result = result.concat("R"); resultArray[i] = "R"; }
  
  }
 */