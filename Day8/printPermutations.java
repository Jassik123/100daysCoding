package start;
import java.util.*;
public class printpermutations {
    public static void print(String str,String t){
        if(str.equals("")) {
            System.out.println(t);
            return ;

        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            String rem =left + right;
            print(rem,t+ch);


        }

    }
    public static void main(String[] args) {
       String str="abc";
       print(str,"");
    }
}
