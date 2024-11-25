
import java.util.*;
public class Prime_factor {
    public static void isPrimeFactor(int n){
        for(int i=2;i<=n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
        if(n>2){
            System.out.print(n+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isPrimeFactor(n);
    }
}
