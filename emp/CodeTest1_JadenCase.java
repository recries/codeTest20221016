package emp;



public class CodeTest1_JadenCase {

	public static void main(String[] args) {
		String s = "   3people 4  unFollowed   me   ";
		String answer = "";
		s = s.toLowerCase();
		String[] sv = s.split(" ");
		for(int i =0; i< sv.length; i++) {
			if(sv[i].length()>=1) {
				char[] sc= sv[i].toCharArray();
				sc[0] = Character.toUpperCase(sc[0]);
				sv[i] = new String(sc);
			}
		}
		if(s.substring(s.length() - 1, s.length()).equals(" ")) {
	        sv[sv.length-1] += " ";
	    }
		answer = sv[0];
		for(int i=1; i< sv.length; i++) {
			answer += " " + sv[i];
		}
		System.out.println(answer);
	}
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        return answer;
	    }
	}
}
