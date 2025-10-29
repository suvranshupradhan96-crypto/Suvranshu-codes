public class Amstrong
{
public static void main(String[]args)
{
Scanner sc=new Scanner(Sydtem.in);
System.out.println("enter the number");
int n=sc .nextInt();
int digit=10;
int t=n;
while(t!=0)
{
t=t/10;
digit++;
}
System.out.println(digit);
t=n;
while (t!=0)
{
int r=t%10;
sum=sum+(int)math.pow(r,digit);
t=t/10;
}
if(sum==n)
{
System.out.println("the number is amstrong");
}
}
}

