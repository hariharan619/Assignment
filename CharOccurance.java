package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "welcome to chennai";
   int count = 0;
   
   char[] arr= str.toCharArray(); 
   
   int len = str.length();
   
   for(int i =0 ; i<len; i++) {
	   if(arr[1]==arr[i]) {
		   count++;
	   }
	   
   }
   System.out.println(count);
	}

}
