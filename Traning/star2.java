public class star2 {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 1; i <= 5; i++) {  // loop from n to 1
            for (int j = 5; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
		for (int i = 1; i <= n; i++) {
            for (int j = 5-1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}