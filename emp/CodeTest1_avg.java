package emp;

public class CodeTest1_avg {
	class Solution {
	    public double solution(int[] arr) {
	      
	        double answer = 0;
	        double sum = 0;
	        double avg = 0;
	        for(int i=0; i <arr.length; i++){
	            sum += arr[i];
	            avg = sum/(i+1);
	        }
	        return avg;
	    }
	}
}
