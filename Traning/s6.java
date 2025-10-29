public class s6 {
    public static void main(String[] args) {
        int i, j, k;
        int rows = 4; 

        for (i = 1; i <= rows; i++) {
       
            for (j = rows - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        for (i = rows - 1; i >= 1; i--) {
            for (j = rows - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}