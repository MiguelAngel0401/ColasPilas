import java.util.Iterator;
import java.util.LinkedList;

public class Cola<T> implements Iterable<T> {
    private LinkedList<T> elementos;

    public Cola() {
        elementos = new LinkedList<>();
    }

    public void enqueue(T valor) {
        elementos.addLast(valor);
    }

    public T dequeue() {
        if (elementos.isEmpty()) {
            return null;
        }
        return elementos.removeFirst();
    }

    public T peek() {
        if (elementos.isEmpty()) {
            return null;
        }
        return elementos.getFirst();
    }

    public boolean empty() {
        return elementos.isEmpty();
    }

    public int size() {
        return elementos.size();
    }

    @Override
    public Iterator<T> iterator() {
        return elementos.iterator();
    }
}



