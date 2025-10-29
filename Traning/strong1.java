import java.util.Scanner;

public class strong1
{
	public static int fact(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
			f=f*i;
		return f;
	}
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
		int sum=0;
		n1=n;
        while (n!=0)
		{
			int d=n%10;
			sum=sum+fac(d);
			n=n/10;
		}
		if(sum==n1)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("It is not a strong number");
        }
    }
}
