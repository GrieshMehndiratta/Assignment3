import java.util.Scanner;

public class Leap_Year {

	public static void Leap(int Year)
	{
		if(Year%400==0)
		{
			System.out.println("Leap Year");
		}
		else if(Year%100==0)
		{
			System.out.println("Not Leap year");
		}
		else if( Year%4==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		Leap(year);
		sc.close();
	}

}
