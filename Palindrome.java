package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String n= "madam",rev="";
  
for(int i = n.length()-1 ; i>=0 ;i-- ) {
	 
	rev= rev+ n.charAt(i);
	
	
}
if(n.equalsIgnoreCase(rev)) {
	
	System.out.println("It is a palindrome");
}
else {
	System.out.println("It is not a palindrome");
}
	
		  
	}

}
