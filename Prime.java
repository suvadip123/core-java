
import java.util.*;
public class Prime {
    public static boolean isPrime(int n){
        int count=0;
        if(n<2){
            return false;
        }
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
    // public static void primeNumber(int lb,int rb){
    //     for(int j=lb;j<=rb;j++){
    //         if(isPrime(j)){
    //             System.out.print(j+" ");
    //         }
    //     }
    // }

    public static int isGetPrime(int n){
        int temp=0;
        while(!isPrime(n)){
            n++;
            temp=n;
        }
        int ans=temp+1;
        return temp;


    }
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        //System.out.println(isPrime(n));
        //primeNumber(1,25);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(isGetPrime(n));
    }
}
