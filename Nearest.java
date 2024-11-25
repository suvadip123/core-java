
import java.util.*;
public class Nearest {
    public static boolean isDivide(int m,int n){
        return (m%n==0);
    }
    public static int isGreatest(int m,int n){
        int temp1=0;
        int temp2=0;
        while(!isDivide(m, n)){
            m++;
            temp1=m;
        }
        int ans1=temp1+1;
        // while(!isDivide(m, n)){
        //     m--;
        //     temp2=m;
        // }
        // int ans2=temp2+1;
        // int min=Math.min(ans1,ans2);
        return ans1;
    }
    public static int isLowest(int m,int n){
        //int temp1=0;
        int temp2=0;
        while(!isDivide(m, n)){
            m--;
            temp2=m;
        }
        int ans2=temp2;
        // while(!isDivide(m, n)){
        //     m--;
        //     temp2=m;
        // }
        // int ans2=temp2+1;
        // int min=Math.min(ans1,ans2);
        return ans2;
    }
    public static int isNearest(int m,int n){
        int res=Math.min(isGreatest(m, n),isLowest(m, n));
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.print(isNearest(m,n));

    }
}
