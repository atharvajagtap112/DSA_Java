package dsa;

import java.util.Arrays;

public class Linear_Search_Algorithm_Question {
    public static void main(String[] args) {
        //Search String
        String name="Atharva";
        char target='t';
//
        System.out.println(Search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    //Search In Range
        System.out.println(SearchInRange(name,target,1,5));
    }
    static Boolean Search2(String str,char target){
        if (str.length()==0){
            return false;
        }
//        for (char c=str.toCharArray())
//        {
//            if (c==target){
//                return true;
//            }
//        }

        return false;
    }
    static Boolean Search(String str,char target){
        if (str.length()==0){
            return false;
        }
        for (int i=0;i<str.length();i++){
            if (target==str.charAt(i)){
                return true;
            }
        }
return false;
    }
    ////Search In Range
    static Boolean SearchInRange(String str,char target,int Start,int End){
        if (str.length()==0){
            return false;
        }
        for (int i=Start = 0; i<End;i++){
            if (target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
