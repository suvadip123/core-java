
import java.util.*;
public class Q5 {

    public static int isFirstOccur(int arr[],int key){
        int size=arr.length;
        int start=0;
        int end=size-1;
        int mid=start+(end-start)/2;
        int ans=-1;
        while(start<=end){
            if(arr[mid]==key){
                ans=mid;
                end=mid-1;
            }
            else if(key>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return ans;


    }
    public static int isLastOccur(int arr[],int key){
        int size=arr.length;
        int start=0;
        int end=size-1;
        int mid=start+(end-start)/2;
        int ans=-1;
        while(start<=end){
            if(arr[mid]==key){
                ans=mid;
                start=mid+1;
            }
            else if(key>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return ans;


    }
    public static int isTotalOccur(int arr[],int key){
        int res=isLastOccur(arr, key)-isFirstOccur(arr, key)+1;
        return res;
    }



    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        // String str=sc.nextLine();
        // int key=sc.nextInt();
        String str=sc.nextLine();
        String str1[]=str.split(" ");
        int size=str1.length;
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(str1[i]);
        }
        int key=sc.nextInt();


        // int arr[]={2,4,6,8,8,8,11,13};
        // int key=8;
        // System.out.print(isFirstOccur(arr,key));
        // System.out.print(isLastOccur(arr,key));
        System.out.print(isTotalOccur(arr,key));

    }
    
}
