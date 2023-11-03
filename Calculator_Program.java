package dsa;

import java.util.Scanner;

public class Calculator_Program {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       int add = 0;
        while (true){
            System.out.println("Enter Opretor");
            char op=sc.next().trim().charAt(0);
            System.out.println("Enter Number One");
            int num1=sc.nextInt();
            System.out.println("Enter Number Two");
            int num2=sc.nextInt();
            if (op=='+'){

                add=num1+num2;
                //System.out.println(add);
            }
            if (op=='-'){
                add=num1-num2;
                //System.out.println(add);
            }
            if (op=='*'){
                add=num1*num2;
               // System.out.println(add);
            }
            if (op=='%'){
                add=num1%num2;
                //System.out.println(add);
            }
            else if (op=='x'||op=='X') {
                break;

            }
//        else{
//                System.out.println("Invalid Opretor");
//            }
            System.out.println(add);
        }


    }
}
