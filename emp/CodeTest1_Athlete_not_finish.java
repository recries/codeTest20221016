package emp;

import java.util.HashMap;

public class CodeTest1_Athlete_not_finish {

	public static void main(String[] args) {
	
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"}; 
		String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String player : participant) {
			map.put(player, map.getOrDefault(player, 0) + 1);
		}
		System.out.println(map);
		for(String player : completion) {
			map.put(player, map.get(player)-1);
		}
		System.out.println(map.keySet());
		for(String key : map.keySet()) {
			if(map.get(key)!=0) {
				answer = key;
				break;
			}
		}
		System.out.println(map);
		System.out.println(answer);
		
		
	}
	//완주하지 못한 선수	
		class Solution {
		    public String solution(String[] participant, String[] completion) {
		        String answer = "";
		        return answer;
		}
	}
	
}
