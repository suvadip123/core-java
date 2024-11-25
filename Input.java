import java.util.*;

public class Input{
    public static void main(String args[]){
        ArrayList<Integer>l=new ArrayList<>();
        ArrayList<Double>d1=new ArrayList<>();
        int n=3;
        Scanner sc =new Scanner(System.in);
        while(sc.hasNextInt()){
            int num=sc.nextInt();
            //double d=sc.nextDouble();
            l.add(num);
            //d1.add(d);
            //n--;
        }
        for(Integer i:l){
            System.out.print(i+" "); 
        }
        System.out.println();
        // for(Double j:d1){
        //     System.out.print(j+" ");
        // }
    }
}