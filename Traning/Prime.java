public class Prime
{
    public static void main(String[] args)
	{
        int N = 50;

        System.out.println("Prime numbers from 1 to " + N + " are:");
        for (int num = 2; num <= N; num++)
		{
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++)
			{
                if (num % i == 0)
				{
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
			{
                System.out.print(num + " ");
            }
        }
    }
}