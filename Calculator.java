package week1.day2;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calc =new Calculator();
		int Addition =calc.add(20, 30);
		System.out.println(Addition);
		double Subtraction = calc.sub(46666.6666, 78888.8888);
		System.out.println(Subtraction);
		double Mulplication = calc.mul(6444.2222, 8999.6666);
		System.out.println(Mulplication);
		int Division = calc.div(10, 5);
		System.out.println(Division);
	}
	/* - sub() with 2 double arguments and return the subraction result
			    - mul() with 2 double arguments and return the result
			    - divide() with 2 int arguments and return the result*/
	
	public int add(int num1,int num2) {
		int Add = num1 +num2;
		return Add;
	}
	
  public double sub(double num1,double num2) {
	// TODO Auto-generated method stub
       double Sub = num1-num2;
    		   return Sub;
	  
}
  public double mul(double num1,double num2) {
	
	double Mul = num1*num2;
	return Mul;
  }
  
  public int div(int num1,int num2) {
	  int Div = num1/num2;
	  return Div;
	  
  }
}
