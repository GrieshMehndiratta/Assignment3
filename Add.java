import java.util.Scanner;


public class Add {
	
	public static int add(int Number1,int Number2)
	{
		int sum=Number1+Number2;
		return sum;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int sum;
		sum=add(number1,number2);
		System.out.println(sum);
		sc.close();
	}

}
