import java.util.*;

public class JavaPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        pq.offer(5);

        System.out.println("Priority Queue: " + pq);

        while (!pq.isEmpty()) {
            System.out.println("Removed: " + pq.poll());
        }
    }
}
