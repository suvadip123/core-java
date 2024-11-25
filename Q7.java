
import java.util.*;
public class Q7 {

    public static void isOddBallon(char ch[]){

        ArrayList<Character>l1=new ArrayList<>();
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        for(int i=0;i<ch.length;i++){
            char temp=ch[i];
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }
            else{
                map.put(temp,1);
            }
        }
      
        Set<Character>keys=map.keySet();
        
        for(Character ch1:keys){
            if((map.get(ch1)%2)!=0){
                l1.add(ch1);
               
                //map.remove(ch1);
            }
        }
        System.out.print(l1.get(0));
        if(l1.isEmpty()){
            System.out.println("All are Even");
        }
    

    }



    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        char ch[]=new char[n];
        for(int i=0;i<n;i++){
            ch[i]=sc.next().charAt(0);
        }
        isOddBallon(ch);
    }
}
