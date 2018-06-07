import java.util.Scanner;

public class Palindrom {

	public static int Palindro(int No1)
	{
		int No2=0,r;
		while(No1!=0)
		{
			r=No1%10;
			No1=No1/10;
			No2=(No2*10)+(r);
		}
		return No2;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int No1=sc.nextInt();
		int No2=Palindro(No1);
		if(No1==No2)
			System.out.println("Palindrom");
		else 
			System.out.println("Not Plaindrom");
		sc.close();

	}

}
