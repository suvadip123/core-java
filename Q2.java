
import java.util.*;
public class Q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        isCompressed(str);
    }
    public static void  isCompressed(String str){
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(  i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            
            System.out.print(str.charAt(i));
             
            if(count>1){
                System.out.print(count.toString()); 
            }
                
            }

        }
    
}
