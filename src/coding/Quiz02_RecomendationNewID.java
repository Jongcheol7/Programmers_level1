package coding;

public class Quiz02_RecomendationNewID {

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		String newId = sol.solution("...!@BaT#*..y.abcdefghijklm");
		System.out.println(newId);
	}

}

class Solution2 {
	public String solution(String new_id) {

		new_id = new_id.toLowerCase(); //1?���? - 모든 ??문자?�� ?��문자�?
		new_id = new_id.replaceAll("([^-_.0-9a-z])", ""); //2?���? - -._?�� ?��?��, ?��문자�? ?��?��?���? 모두 ?���?
		new_id = new_id.replaceAll("[.]{2,}", "."); //3?���? - .?�� ?���? ?��?��?���? ?��?���? 바꾸�?
		new_id = new_id.replaceAll("^[.]", ""); //4?���? - .?���? ?��?��?��거나 ?��?���? �??���?
		new_id = new_id.replaceAll("[.]$", "");

		//5?���? - 값이 ?��?���? a�? 채우�?
		if(new_id.equals("")) {
			new_id = "a"; 
		}

		//6?���? - 16?�� ?��?��?���? 15?��까�? 만들�?, ?�� ?��리�? .?���? ?���?
		if(new_id.length() >= 16) {     
			new_id = new_id.substring(0, 15);
			for(int i=0; i<new_id.length(); i++) {
				if(new_id.substring(new_id.length()-1).equals(".")) {
					new_id = new_id.substring(0, new_id.length()-1);
				}
			}
		}

		//7?���? - �??���? 2?�� ?��?���? 마�?�? �??���? 계속 ?���?
		while(true){
			if(new_id.length()<=2) {
				new_id = new_id.concat(new_id.substring(new_id.length()-1));
				continue;
			}
			break;
		}


		String answer = new_id;
		return answer;
	}
}
