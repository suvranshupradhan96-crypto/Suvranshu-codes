public class arry6 {
    public static void main(String[] args) {
        int arr[]={2,3,5,6};
        int seerchelement=3;
        int found=0;
        for(int i=0;i<arr.length;i++)
        {
            if (arr [i]==seerchelement){
                found=1;
                System.out.println("seerchelement "+seerchelement+ " is "+i);
            }
        }
    }
    
}
