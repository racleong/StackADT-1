import java.util.List;

public class FixedList implements QueueADT<E>{

    private List<E> fixedList;

    public FixedList(){
        fixedList = new List<E>();
    }
    @Override
    public int size() {
        return 0;
    }

    @Override
    public void enqueue(E element) {

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
