
import java.util.*;
public class Q1 {
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(isCount(arr));
    }
    public static int isCount(int arr[]){
        int n=arr.length;
        //int flag=0;
        int count=0;
        for(int i=0;i<n;i++){
            int flag=0;
            int max=arr[n-i-1];
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>=max){
                    flag=1;
                    break;
                }
            }
        
        if(flag==0){
            count++;
        }
    }

        return count;
    }
}
