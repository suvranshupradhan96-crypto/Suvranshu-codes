public class arry7 {
    public static void main(String[] args) {
        int arr[]={2,3,5,5,6,5,5};
        int key=5;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if (key==arr[i])
            {
                count++;
            }
        }
    System.out.println("my key value is "+count+" times apper");
    }
}

