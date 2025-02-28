import java.util.*;
class Calculator{
	static void calculate(int number1,int number2){
		
	}
	public static int addition(int number1,int number2){
		return number1+number2;
	}
	public static int substraction(int number1,int number2){
		return number2-number1;
	}
	public static int multiplication(int number1,int number2){
		return number2*number1;
	}
	public static int division(int number1,int number2){
		return number2/number1;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1 that should be less than number2 :" );
		int number1=sc.nextInt();
		System.out.println("Enter number 2 :" );
		int number2=sc.nextInt();
		int add=addition(number1,number2);
		int sub=substraction(number1,number2);
		int mul=multiplication(number1,number2);
		int div=division(number1,number2);
		System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers"+ number1+" and"+ number2+" is "+ add+ " ,"+sub+" ,"+mul+" and "+div);
		
	}
}