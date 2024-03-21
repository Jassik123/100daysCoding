package etePdf;
import java.util.*;

public class kthElementFromlast {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;

        }
    }
    public static Node Nth(Node head,int s){
      Node slow=head;
      Node fast=head;

      for(int i=1;i<=s;i++){
          fast=fast.next;

      }
      while(fast!=null){
          fast=fast.next;
          slow=slow.next;
      }
      return slow;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    LinkedList <Integer> list=new LinkedList<>();

    for(int i=0;i<n;i++){
        list.add(sc.nextInt());
    }
    int s=sc.nextInt();







    }
}
