public class star {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = n; i >= 1; i--) {  // loop from n to 1
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}