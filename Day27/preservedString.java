package etePdf;
import java.util.*;

public class reversingPreserved {
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String st=sc.nextLine();
            char a[]=st.toCharArray();
            char result[]=new char[a.length];
            for(int i=0;i<a.length;i++){
                if(a[i]==' ' ){
                    result[i]=' ';
                }
            }
            int j=a.length-1;
            for(int i=0;i<a.length;i++){
                if(a[i]!=' '){
                    if(result[j]==' '){
                        j--;
                    }

                    result[j]=a[i];
                    j--;

                }

            }
            System.out.println(String.valueOf(result));

        }
    }


