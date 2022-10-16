package emp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeTest2_Min {
	//최솟값 구하기
	public static void main(String[] args) {
		int[] A = {1,4,2};
		int[] B = {5,4,4};
		int answer =0;
		List<Integer> alist = new ArrayList<Integer>();
		List<Integer> blist = new ArrayList<Integer>();
		Arrays.sort(A);
		Arrays.sort(B);
		 for (int i = 0; i < B.length / 2; i++) {
	            int temp = B[i];
	            B[i] = B[B.length - i - 1];
	            B[B.length - i - 1] = temp;
	        }
		for(int i=0; i<A.length; i++) {
			alist.add(A[i]);
			blist.add(B[i]);
		}
		for(int i=0; i<alist.size(); i++) {
			answer += alist.get(0)*blist.get(0);
			alist.remove(0);
			blist.remove(0);
			alist.add(0);
			blist.add(0);
		}
		System.out.println(answer);
	
	}
	class Solution
	{
	    public int solution(int []A, int []B)
	    {
	        int answer = 0;

	        System.out.println("Hello Java");

	        return answer;
	    }
	}
}
