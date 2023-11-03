package dsa;

public class Amstrong_Number {


    public static void main(String[] args) {

       // System.out.println(isAmstrong(153));


        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

    }
    static boolean isArmstrong(int n){
        int orignal=n;
        int ans=0;
        while (n>0){
            int temp=n%10;
            n=n/10;
            ans=ans+temp*temp*temp;


        }

        return ans== orignal;
    }
//static boolean isArmstrong(int n) {
//    int original = n;
//    int sum = 0;
//
//    while (n > 0) {
//        int rem = n % 10;
//        n = n / 10;
//        sum = sum + rem*rem*rem;
//    }
//
//    return sum == original;
//}
}
