public class neonrange
{
public static void main(String[]args)
{
int range=1000;
for(int i=1;i<1000;i++)
{
int m=i*i;
int sum=0;
while(m!=0)
{
int r=m%10;
sum=sum+r;
m=m/10;
}
if(sum==i)
{
System.out.println(i);
}
 }
  }
   }
