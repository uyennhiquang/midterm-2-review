package unit04;

import java.util.Iterator;

public interface Stack<E> extends Iterable<E>{
    int size();
    E top();
    void push(E value);
    E pop();

    default Iterator<E> iterator() {
        return null;
    }
}
