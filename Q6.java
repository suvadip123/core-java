
import java.util.*;
public class Q6 {
    public static boolean isSorted(int arr[],int i){
        //int size=arr.length;
        
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1[]=str.split(" ");
        int size=str1.length;
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(str1[i]);
        }
        System.out.print(isSorted(arr,0));

    }
}
