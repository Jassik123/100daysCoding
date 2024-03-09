package etePdf;
import java.util.*;

public class ProductiveCharacter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length()-1;i+=2){
            char ch=str.charAt(i);
            char ch1=str.charAt(i+1);

            if(ch>ch1){
                s.append(ch);
            }
            else{
                s.append(ch1);
            }

        }
        if(str.length()%2!=0){
            s.append(str.charAt(str.length()-1));
        }
        System.out.println(s);

    }
}
