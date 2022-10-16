package emp;

public class CodeTest_phoneNumber {
	public static void main(String[] args) {
		String phone_number  = "15234555";
		String first_num = "";
		String last_num =""; 
		if(phone_number.length() >= 4) {
		
		first_num = phone_number.substring(0, phone_number.length()-4);
		first_num = first_num.replaceAll("[0-9]", "*");
		last_num = phone_number.substring(phone_number.length()-4, phone_number.length());
		}
		phone_number = first_num + last_num;
		
	}
		public String solution(String phone_number) {
		        String answer = "";
		        return answer;
	}
	
}
