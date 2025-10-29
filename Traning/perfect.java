public class perfect
{
public static void main(String[]args)
{
int num;
int sum=0;
System.out.println("enter a perfect number");
for(int i=1;i<=num;i++)
{
if(num%i==0)
{
sum+=i;
}
}
if(sum==num)
{
System.out.println("the number is a perfect number");
}
else
{
System.out.println("the number is not a perfect number");
}
}
}

