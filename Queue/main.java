package Queue;

import java.util.Random;

public class main {

    public static void main(String[] args) {

        int n=1000000;
        Random r=new Random();

        queue queue=new queue<Integer>();
        for (int i = 0; i < n; i++) {
            queue.enQueue(r.nextLong(10000000));
        }

        for (int i = 0; i < n; i++) {
            System.out.print(queue.deQueue()+" ");
        }
        System.out.println("end.");
    }
}
