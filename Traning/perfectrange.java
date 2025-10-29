 public class perfectrange
{
public static void main(String[]args)
{
int range=2000;
for(int i=1;i<range;i++)
{
int sum=0;
int n=i;
for(int j=1;j<n;j++)
{
if(n%j==0)
{
sum=sum+j;
}
}
if(sum==n)
{
	System.out.println(i);
}
 }
  }
   }


	