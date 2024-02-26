package start;
import java.util.*;
public class checktosurviveinisland {
    public static void main(String[] args) {
        int S=10;
        int N=16;
        int M=2;

        int total_food_required=S*M;
        int result;
        if(M>N ||(7*M)>(6*N)){
            result=-1;
        }
        else{
            result=(int)Math.ceil((double)total_food_required/N);
        }
        System.out.println(result);
    }
}
