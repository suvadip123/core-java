
import java.util.*;
public class Bit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int i=sc.nextInt();
        // double n=sc.nextDouble();
        // System.out.printf("%.2f",n);
        //System.out.print(isGetBit(n,i)?'1':'0');
        isToggle(n);

    }
    public static boolean isGetBit(int n,int i){
        return ((n & (1<<i))!=0);
    }
    public static void isToggle(int n){
        int total=(int)(Math.log(n)/Math.log(2));
        int res=(int)Math.floor(total);
        int finalres=res+1;
        int mask=(1<<finalres)-1;
        int ans=n^mask;
        System.out.print("The toggle bits are :"+ans);
    }
}
