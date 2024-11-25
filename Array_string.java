
import java.util.*;

public class Array_string {


    public static String isResult(int arr[],int m,int n){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if( (arr[i]%m)==0 && (arr[i]%n)==0){
                sb.append("ThreeFive");
            }
            else if((arr[i]%m)==0){
                sb.append("Three");
            }
            else if((arr[i]%n)==0){
                sb.append("Five");
            }
            else{
                sb.append(Integer.toString(arr[i]));
            }
            sb.append(" ");
        }
        String str=sb.toString();
        return str;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int m=sc.nextInt();
        String  str=sc.nextLine();
        String s[]=str.split(" ");
        int size=s.length;
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.print(isResult(arr,n,m));
    }
}


