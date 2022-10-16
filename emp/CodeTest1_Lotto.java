package emp;


public class CodeTest1_Lotto {
	//로또 랜덤
	public static void main(String[] args) {
		int[] lottos = {1,2,3,4,5,6};
		int[] win_nums = {7,8,9,10,11,12};
		int zero=0;
		int row_rank=7;
		int high_rank=7;
		for(int i=0; i<6; i++) {
			if(lottos[i] ==0) {
				--high_rank;
			}for(int j=0; j<6; j++) {
				zero += win_nums[i]; 
				if(zero == 0) {
					row_rank = 1;
					high_rank =1;
				}else {
					if(lottos[i]== win_nums[j]) {
						--high_rank;
						--row_rank;
					}
				}
			}
		}
		if(row_rank == 7) {
			row_rank =6;
		}
		if(high_rank ==7) {
			high_rank = 6;
		}
		int[] answer = {high_rank, row_rank};
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}
	
	class Solution {
		public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        
        return answer;
		    }
		}

}