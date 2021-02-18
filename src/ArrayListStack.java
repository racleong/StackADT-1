import java.util.ArrayList;

/**
 * This class implements the StackADT interface using an ArrayList.
 *
 * @author (Caroline McGregor)
 * @version (a version number or a date)
 */
public class ArrayListStack<E> implements StackADT<E>
{
    //A data field of ArrayList type that stores the stack elements.
    private ArrayList<E> stack;

    /**
     * The constructor creates an ArrayList object and stores it to the data field.
     */
    public ArrayListStack(){
        stack = new ArrayList<E>();
    }

    /**
     * Removes the object at the top of the stack and returns that object as the value.
     */
    public E pop(){
        //Complete method body...
        return this.stack.remove(this.stack.size() -1);
    }

    /**
     * Looks at the object at the top of the stack without removing it from the stack.
     */
    public E top(){
       return this.stack.get(this.stack.size() - 1);
    }

    /**
     * Returns the size of the stack, i.e. no of elements currently in the stack.
     */
    public int size(){
        return this.stack.size();
    }

    /**
     * Tests if the stack is empty.
     */
    public boolean isEmpty(){
        if(this.stack.size() == 0) {
            return true;
        }else {
            return false;
        }
    }

    /**
     * Pushes/adds an item onto the top of the stack.
     */
    public void push(E element){
        this.stack.add(element);
    }

}
