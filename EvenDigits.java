package dsa;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumber(nums));
        System.out.println(digits(4555));
        System.out.println(digits2(455555));
    }
    static int findNumber(int[] nums){
        int count=0;
        for (int num:nums){
            if (even(num)){
                count++;
            }

        }
        return count;
    }

  static boolean even(int num) {
        int NumOfDigits=digits(num);
if (NumOfDigits%2==0){
    return true;
}
return false;
    }
    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    static int digits(int num){
        if (num<0){
            num=-1*num;
        }
        if (num==0){
            return 1;
        }
        int count=0;

        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
