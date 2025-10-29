public class PrimeSum {
    public static void main(String[] args) {
        int n = 30;
        int sum = 0;

        System.out.println("Prime numbers between 1 and " + n + ":");

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println("\nSum of prime numbers = " + sum);
    }
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}