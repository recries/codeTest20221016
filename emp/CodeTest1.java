package emp;

public class CodeTest1 {

	public static void main(String[] args) {
		String new_id = "abcdefghijklmn.p";
		 String answer = "";
	        new_id = new_id.toLowerCase();
	        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
	        new_id = new_id.replaceAll("[.]+", ".");
	        if(new_id.length()>0) {
	        if(new_id.substring(0,1).equals(".")) {
	        	new_id = new_id.replaceFirst(".", "");
	        }
	        }
	        if(new_id.length()>1) {
	        if(new_id.substring(new_id.length()-1).equals(".")) {
	        	new_id = new_id.replaceFirst(".$", "");
	        }}
	        if(new_id.equals("")) new_id ="a";
	        	if(new_id.length()>15) {
	        		new_id = new_id.substring(0,15);
	        		if(new_id.substring(new_id.length()-1).equals("."))
	        			new_id  =new_id.replaceFirst(".$","");
	        	}
	        	if(new_id.length()<=2) {
	        		while(new_id.length()<3) {
	        			new_id += new_id.substring(new_id.length() -1);
	        		}
	        		}
	        System.out.println(new_id);
	}
	
	class Solution {
	    public String solution(String new_id) {
	            new_id = new_id.toLowerCase();
		        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
		        new_id = new_id.replaceAll("[.]+", ".");
		        new_id = (new_id.charAt(0) == '.') ? new_id.substring(1) : new_id; 
		        new_id = (new_id.charAt(new_id.length() -1) == '.') ? new_id.substring(0, new_id.length()-1) : new_id;
		        if(new_id.equals("")) new_id ="a";
		        
		        for(int i=0; i<=new_id.length(); i++) {
		        	if(i<=15) {
		        		new_id = new_id.substring(0,15);
		        	}
		        }
		        new_id = (new_id.charAt(14) == '.') ? new_id.substring(0, new_id.length() -1) : new_id;  
		        	if(new_id.length()<=2) {
		        			if(new_id.length() == 1) {
		        				new_id = new_id +  new_id.substring(0, new_id.length() -1 )+  new_id.substring(0, new_id.length() -1 );
		        			}
		        			else if(new_id.length() == 2) {
		        				new_id = new_id +  new_id.substring(0, new_id.length() -1 );
		        			}
		        		}
	        String answer = new_id;
	        return answer;
	    }
	}
}
