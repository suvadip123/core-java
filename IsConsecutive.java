import java.util.*;

public class IsConsecutive {
    public static int isCount(int arr[]){
        int count=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }
            ans=Math.max(ans,count);

        }
        return ans;
    }
    public static void main(String args[]){
        int arr[]={1,1,0,1,1,1};
        System.out.print(isCount(arr));
    }
}
