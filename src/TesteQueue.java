import dataStructure.Queue;

public class TesteQueue {
    public static void main(String[] args) {
        Queue myQueue = new Queue(1);

        myQueue.getFirst(); //obter primeiro elemento de uma fila
        myQueue.getLast(); //obter último elemento de uma fila
        myQueue.getLength(); //obter comprimento/quantidade de elementos de uma fila
        myQueue.print();

        myQueue.enqueue(2); //adicionar elemento na fila
        myQueue.enqueue(3);
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.print();

        myQueue.dequeue(); //remover primeiro elemento da fila
        myQueue.print();
    }
}
