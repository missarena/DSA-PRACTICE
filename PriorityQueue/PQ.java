import java.util.PriorityQueue;

public class PQ {

    public static void main(String args[]){
    PriorityQueue <Integer> pq=new PriorityQueue<>();
    
    
    pq.add(3);   //O(logn)
    pq.add(4);
    pq.add(6);
    pq.add(1);

    while(!pq.isEmpty()){
        System.out.println(pq.peek());  //O(1)
        pq.remove();
    }
    }
}