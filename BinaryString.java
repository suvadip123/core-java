public class BinaryString {

    public static int isValue(String str){
        if(str==null){
            return -1;
        }
        int res=str.charAt(0)-'0';
        for(int i=1;i<str.length();){
            char prev=str.charAt(i);
            i++;
        if(prev=='A'){
            res=res&(str.charAt(i)-'0');
        }
        else if(prev=='B'){
            res=res|(str.charAt(i)-'0');
        }
        else {
            res=res^(str.charAt(i)-'0');
        }
        i++;
    }
    return res;

    }
    public static void main(String args[]){
        String str="0C1A1B1C1C1B0A0";
        System.out.print(isValue(str));

    }
    
}
