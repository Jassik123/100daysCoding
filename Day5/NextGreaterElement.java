package start;
import java.util.*;
public class nextGreaterElement {
    public static int[] NextGreater(int[] arr){

        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=n-2;i>=0;i++) {
            while(st.peek()<arr[i] && st.size()==0) {
                st.pop();
            }
        }

        int[] res=new int[st.size()];
        int m=res.length;
        for(int i=m-1;i>=0;i--) {
            res[m-1]=-1;
            st.push(arr[n-1]);
            if(st.size()==0) {
                res[i]=-1;

            }else{
                res[i]=st.peek();
                st.push(arr[i]);
        }

        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[] res= NextGreater(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    }

