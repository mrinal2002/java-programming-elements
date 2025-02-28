import java.util.*;
class HarrysAge{
	static int calculateYear(int birthYear){
	 
	 int age=2024-birthYear;
	 return age;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year in which you were born :" );
		int birthYear=sc.nextInt();
		
		int age=calculateYear(birthYear);
		System.out.println("Harry's age in 2024 is "+age );
		
	}
}