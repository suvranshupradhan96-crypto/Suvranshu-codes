import java.util.Scanner;
public class allamstrong {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a range, you want to display all amstrong no in between this");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            int sum=0;
            int num=i;
            int digit=0;
            int orginalnum=num;
        
        while(orginalnum!=0){
          orginalnum=orginalnum/10;
          digit++;
        }
        orginalnum=num;
        while(orginalnum!=0){
            int r=orginalnum%10;
            sum=sum+(int)Math.pow(r,digit);
            orginalnum=orginalnum/10;
        }
        
        if (sum==num){
            System.out.println(i);
        }
            
        }
    }
}