
import java.util.*;
public class Gcd {
    public static int gcd(int a ,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("GCD"+gcd(a,b));
    }
}
