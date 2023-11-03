package dsa;

import java.util.Scanner;

public class _1_Loops_Question {
    public static void main(String[] args) {
        //Fibonachi Number
     /*   Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a=0;
        int b=1;
        int count =2;
        while (count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
*/
        //counting number
        int num=45535;
        int count1 =0;
       while (num>0){
           int rem =num%10;
           if (rem==5){
               count1++;
           }
         num=num/10;
       }
        System.out.println(count1);

       //////////////////////////////////////////////////////////////////////////////
       int f =455544;
        System.out.println(f%10);
        System.out.println(f/10);
    }

}
