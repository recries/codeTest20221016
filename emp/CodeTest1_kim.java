package emp;

public class CodeTest1_kim {

	public static void main(String[] args) {
		String[] seoul = {"Jane","Kim"};
		String answer = "";

		int position = 0;
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				position = i;
			}
		}
		answer = "김서방은 "+ position +"에 있다.";
		
		
		
	}
	class Solution {
	    public String solution(String[] seoul) {
	        String answer = "";
	        return answer;
	    }
	}
}
