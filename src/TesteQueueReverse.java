import java.util.LinkedList;
import java.util.Queue;

import problems.QueueReverse;

public class TesteQueueReverse {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(QueueReverse.reverseFirstK(queue, 3));
    }
}
