package emp;

import java.util.HashSet;

public class CodeTest1_Phonekemon {

	public static void main(String[] args) {
		int answer = 0;
		int[] nums = {3,3,3,2,2,2,7,1,4,6,11,11};
		HashSet<Integer> set = new HashSet<Integer>();
		if(nums.length%2 ==0) {
			for(int i=0; i<nums.length; i++) {
				set.add(nums[i]);
			}
		if(set.size() > nums.length/2) {
			answer = nums.length/2;
		}else{
			answer = set.size();
			}
		}
		
		System.out.println(set.size());
	}
	class Solution {
	    public int solution(int[] nums) {
	        int answer = 0;
	        return answer;
	    }
	}
}
