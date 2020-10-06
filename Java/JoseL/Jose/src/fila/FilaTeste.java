package fila;

/**
 *
 * @author edivan
 */
public class FilaTeste {

    public static void main(String[] args) {
        Fila fila = new Fila(3);

        try {
            fila.enqueue(1);
            fila.enqueue(2);
            fila.enqueue(3);
            System.out.println("Frente: " + fila.peek());
            fila.dequeue();
            fila.enqueue(4);
            System.out.println("Frente: " + fila.peek());
            fila.dequeue();
            fila.dequeue();
            fila.dequeue();
            fila.dequeue();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
