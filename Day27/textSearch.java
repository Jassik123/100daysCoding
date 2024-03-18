package etePdf;
import java.util.*;

public class TextSearch {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();a
        String s = sc.nextLine();
        List<Integer> ll = new ArrayList<>();

        for (int i = 0; i <= str.length()-s.length();i++){
            String st=str.substring(i,i+s.length());
            if(st.equals(s)){
                ll.add(i);
            }
        }
        if(ll.isEmpty()){
            System.out.println("-1");
        }
        else{
            System.out.println(ll);
        }

    }
}
