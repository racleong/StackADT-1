public interface QueueADT <E>{

    int size();

    void enqueue(E element);

    // will remove item from the queue
    E dequeue();

    // look at items in the queue
    E peek();

    boolean isEmpty();

}