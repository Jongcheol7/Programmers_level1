package coding;

public class Quiz24_SecretMap {

	public static void main(String[] args) {
		Solution24 sol = new Solution24();
		int[] arr1 = {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		sol.solution(5, arr1, arr2);
	}

}
class Solution24 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int arr11[][] = new int[n][n];
        int arr22[][] = new int[n][n];
        String result[][] = new String[n][n];
        
        for(int i=0; i<n; i++) {
        	int x = arr1[i];       	
        	for(int k=n-1; k>=0; k--) {        		
        		arr11[i][k] = x % 2;
        		x = x / 2;        		
        	}
        }
        
        for(int a=0; a<n; a++) {
        	for(int b=0; b<n; b++) {
        		System.out.print(arr11[a][b]+ "  ");
        	}
        	System.out.println();
        }
        System.out.println();
        //---------------------------
        for(int i=0; i<n; i++) {
        	int x = arr2[i];       	
        	for(int k=n-1; k>=0; k--) {        		
        		arr22[i][k] = x % 2;
        		x = x / 2;        		
        	}
        }
        
        for(int a=0; a<n; a++) {
        	for(int b=0; b<n; b++) {
        		System.out.print(arr22[a][b]+ "  ");
        	}
        	System.out.println();
        }
        System.out.println();
        // -------------------------------
        for(int c=0; c<n; c++) {
        	for(int d=0; d<n; d++) {
        		if(arr11[c][d] == 1 || arr22[c][d] == 1) {
        			result[c][d] = "#";
        		}else {
        			result[c][d] = " ";
        		}
        	}
        }
        for(int a=0; a<n; a++) {
        	for(int b=0; b<n; b++) {
        		System.out.print(result[a][b]+ "  ");
        	}
        	System.out.println();
        }
        System.out.println();
        // ---------------------------
        
        for(int c=0; c<n; c++) {
        	answer[c] = "";
        	for(int d=0; d<n; d++) {
        		if(arr11[c][d] == 1 || arr22[c][d] == 1) {
        			answer[c] = answer[c] + "#";
        		}else {
        			answer[c] = answer[c] + " ";
        		}
        	}
        }
        
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        System.out.println(answer[2]);
        System.out.println(answer[3]);
        System.out.println(answer[4]);
        
        
        return answer;
    }
}