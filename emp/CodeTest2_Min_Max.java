









package emp;

import java.util.ArrayList;
import java.util.List;

public class CodeTest2_Min_Max {

	public static void main(String[] args) {
		String s ="200 -1 -2 -3 -4 50 100 -55555 555 ";
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		List<Integer> count = new ArrayList<Integer>();
		String[] str = s.split(" ");
		for(int i=0; i<str.length; i++) {
			count.add(Integer.parseInt(str[i]));
		}
		for(int i=0; i<count.size(); i++) {
		if(max < count.get(i)) {
			max = count.get(i);
		}
		if(min > count.get(i)) {
			min = count.get(i);
		}
		}
		String answer = String.valueOf(min) + " "+ String.valueOf(max);
		System.out.println(max);
		System.out.println(answer);
		}
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        return answer;
	    }
	}
}
