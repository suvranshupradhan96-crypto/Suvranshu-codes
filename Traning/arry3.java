public class arry3 {
    public static void main(String[] args) {
        int a=0;
    int[]arr={1,10,3,4};
    int max=arr[0];
     for (int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
     }
     System.out.println("largest number =" + max);
    }
    
}
