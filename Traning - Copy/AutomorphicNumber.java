import java.util.Scanner;

public class AutomorphicNumber
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        if (String.valueOf(square).endsWith(String.valueOf(num)))
		{
            System.out.println( Automorphic Number.");
        } else 
		{
            System.out.println(NOT an Automorphic Number.");
        }
    }
}