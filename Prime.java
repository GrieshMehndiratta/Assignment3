import java.util.Scanner;

public class Prime {
	
	public static void prime(int No1)
	{
		int temp=0;
		if(No1>2)
		{
			for(int i=2;i<No1;i++)
			{
				if(No1%i==0)
				{
					temp=1;
				}
			}
		}
		if(temp==0||No1==2)
			System.out.println("Prime");
		else 
			System.out.println("Not Prime");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int No1=sc.nextInt();
		prime(No1);
		sc.close();

	}

}
