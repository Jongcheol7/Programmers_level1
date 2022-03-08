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

		new_id = new_id.toLowerCase(); //1?¨κ³? - λͺ¨λ  ??λ¬Έμ? ?λ¬Έμλ‘?
		new_id = new_id.replaceAll("([^-_.0-9a-z])", ""); //2?¨κ³? - -._? ?«?, ?λ¬Έμλ₯? ? ?Έ?κ³? λͺ¨λ ? κ±?
		new_id = new_id.replaceAll("[.]{2,}", "."); //3?¨κ³? - .?΄ ?κ°? ?°??΄λ©? ??λ‘? λ°κΎΈκΈ?
		new_id = new_id.replaceAll("^[.]", ""); //4?¨κ³? - .?Όλ‘? ???κ±°λ ??λ©? μ§??°κΈ?
		new_id = new_id.replaceAll("[.]$", "");

		//5?¨κ³? - κ°μ΄ ??Όλ©? aλ‘? μ±μ°κΈ?
		if(new_id.equals("")) {
			new_id = "a"; 
		}

		//6?¨κ³? - 16? ?΄??΄λ©? 15?κΉμ? λ§λ€κ³?, ? ?λ¦¬κ? .?΄λ©? ? κ±?
		if(new_id.length() >= 16) {     
			new_id = new_id.substring(0, 15);
			for(int i=0; i<new_id.length(); i++) {
				if(new_id.substring(new_id.length()-1).equals(".")) {
					new_id = new_id.substring(0, new_id.length()-1);
				}
			}
		}

		//7?¨κ³? - κΈ??κ°? 2? ?΄?λ©? λ§μ?λ§? κΈ??λ₯? κ³μ ?£κΈ?
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
