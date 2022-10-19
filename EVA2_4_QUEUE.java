package eva2_4_queue;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA2_4_QUEUE {

    public static void main(String[] args) {
        // TODO code application logic here
        MyQueue myQueue = new MyQueue();
        
        myQueue.agregar(10);
        myQueue.agregar(20);
        myQueue.agregar(30);
        myQueue.agregar(40);
        myQueue.agregar(50);
        System.out.println("Primer valor en llegar: " + myQueue.peek());
        myQueue.imprimir();
        try {
            System.out.println("Primer valor en llegar: " + myQueue.poll());
        } catch (Exception ex) {
            Logger.getLogger(EVA2_4_QUEUE.class.getName()).log(Level.SEVERE, null, ex);
        }
        myQueue.imprimir();
    }
    
}
