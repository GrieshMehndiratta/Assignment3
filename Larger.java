import java.util.Scanner;

public class Larger {

	public static void larger(int No1,int No2,int No3)
	{
		if(No1>No2&&No1>No3)
		{
			System.out.println("Larger No : "+No1);
		}
		else if(No2>No1&&No2>No3)
		{
			System.out.println("Larger No : "+No2);
		}
		else if(No3>No2&&No3>No1)
		{
			System.out.println("Larger No : "+No3);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int No1=sc.nextInt();
		int No2=sc.nextInt();
		int No3=sc.nextInt();
		larger(No1,No2,No3);
		sc.close();
	}
}
