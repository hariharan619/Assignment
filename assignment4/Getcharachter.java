package week3.assignment4;

public class Getcharachter {

	public static void main(String[] args) {
		
		String str = "Java Exercises!";
        System.out.println("Original String = " + str);
        // Get the character at positions 0 and 10.
        int index1 = str.charAt(6);
        int index2 = str.charAt(12);
        int index3 = str.charAt(14);  
        // Print out the results.
        System.out.println("The character at position 0 is " +
            (char)index1);
        System.out.println("The character at position 10 is " +
            (char)index2);
	System.out.println("The character at position 10 is " +
            (char)index3);
				
	}
}
