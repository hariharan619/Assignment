package week3.assignment;


public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Student stud = new Student();
	   stud.collegeCode(01);
	   stud.collegeName("Sivet");
	   stud.collegeRank(1);
	   System.out.println(stud.deptName("Commerce"));
	   System.out.println(stud.studentId(12));
	   System.out.println(stud.studentName("hariharabalaji"));
		
	}
	public String collegeName(String a){
		
		System.out.println(a);
		return a;
	}

public int collegeCode(int code) {
	System.out.println(code);
	return code;
}
public int collegeRank(int rank ) {
	System.out.println(rank);
	return rank;
}
	
}

