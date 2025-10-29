public clas arry8 {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 20, 95,10,25, 15, 25};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num >secondLargest && num !=largest) {
                secondLargest = num;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements equal or only one element).");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}