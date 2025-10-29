public class arry9{
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 15, 25, 18};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num < first) {
                third = second;
                second = num;
            } else if (num > third && num < second) {
                third = num;
            }
        }

        if (third == Integer.MIN_VALUE) {
            System.out.println("No third largest element (array too small or elements repeated).");
        } else {
            System.out.println("Third largest element: " + third);
        }
    }
}