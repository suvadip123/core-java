import java.util.*;

public class LongestString {
    public static String isLong(String str){
        String str1="";
        int max=Integer.MIN_VALUE;
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>max){
                max=arr[i].length();
                str1=arr[i];
            }
        }
        return str1;

    }
   public static void main(String args[]){
    String str="This is a greatvhfnbvhgn valuesome";
    System.out.print(isLong(str));

   } 
}
