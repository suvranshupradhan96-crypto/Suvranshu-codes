public class arry5 {
    public static void main(String[] args) {
    int[]arr={1,10,3,4};
    int length=arr.length;
    int left=0;
    int right=length-1;
    while(left<right)
    {
        int temp=arr[left];
        arr [left]=arr[right];
        arr [right]=temp;
        left++;
        right--;
    }
    for(int i=0;i<length;i++){
        System.out.print(arr[i]+" ");
    }

    }
}


