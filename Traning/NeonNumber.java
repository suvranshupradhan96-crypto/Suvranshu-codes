public class c {
    public static void main(String[] args) {
        int num = 9;
        int sq = num * num;
        int sum = 0;

        while(sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }

        if(sum == num)
            System.out.println(Neon Number");
        else
            System.out.println(NOT a Neon Number");
    }
}