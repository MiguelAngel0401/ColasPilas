import java.util.Iterator;
import java.util.LinkedList;

public class Pila<T> implements Iterable<T> {
    private LinkedList<T> elementos;

    public Pila() {
        elementos = new LinkedList<>();
    }

    public void crear(T valor) {
        elementos.addFirst(valor);
    }

    public T pop() {
        if (elementos.isEmpty()) {
            return null;
        }
        return elementos.removeFirst();
    }

    public T top() {
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






