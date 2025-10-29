public class arry4 {
    public static void main(String[] args) {
        int a=0;
    int[]arr={1,10,3,4};
    int small=arr[0];
     for (int i=0;i>arr.length;i++){
        if(arr[i]<small){
            small=arr[i];
        }
     }
     System.out.println("smallest number =" + small);
    }
    
}
