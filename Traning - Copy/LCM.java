public class LCM{
    public static void main(String[] args) {
        int a = 12;   // first number
        int b = 18;   // second number

        int max = (a > b) ? a : b;  // maximum of a and b
        int lcm = 0;

        while (true) {
            if (max % a == 0 && max % b == 0) {
                lcm = max;
                break;  // stop when LCM found
            }
            max++;
        }

        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}