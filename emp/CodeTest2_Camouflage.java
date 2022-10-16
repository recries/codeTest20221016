package emp;

import java.util.HashMap;

public class CodeTest2_Camouflage {

	public static void main(String[] args) {
		String[][] clothes ={ {"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
		HashMap<String, String> map = new HashMap<String, String>();
		String split= "";
		String[] map2;
		int count =0;
		for(int i=0; i< clothes.length; i++) {
			split += clothes[i][0]+" ";
		for(int j=0; j< clothes[i].length;j++) {
			map.put(clothes[i][0], clothes[i][j]);
		}}
		map2 = split.split(" ");
		for(String i : map.keySet()) {
			if(map.keySet().size()>1) {
				count = map.keySet().size();
			}
			System.out.println(map.get(i));
		}
		System.out.println(count);
	}
	class Solution {
	    public int solution(String[][] clothes) {
	        int answer = 0;
	        return answer;
	    }
	}
}
