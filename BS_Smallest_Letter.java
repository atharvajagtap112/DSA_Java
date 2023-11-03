package dsa;

import javax.print.DocFlavor;

public class BS_Smallest_Letter {
    public static void main(String[] args) {
     char[] letters = {'c','f','j'};
      char target='j';
        System.out.println(SmallestLetter(letters,target));

    }
    static char SmallestLetter(char[] letters,char target){
        int start=0;
        int end= letters.length-1;
        while (start<=end){
            //int mid=start+end/2; // might be possible that (start + end) exceeds the range of int in java
            int mid=start+(end-start)/2;
            if (target < letters[mid]) {
                end = mid - 1;}
            else  {
                start=1+mid;
            }

        }
        return letters[start% letters.length];//if(strat==letters.length){retun letter[letter.length]}

    }
}
