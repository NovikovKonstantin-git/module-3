import java.util.*;

public class AnalogueArrayList<P> {
    private Object[] items;
    private int size;

    public AnalogueArrayList() {
        this(10);
    }

    public AnalogueArrayList(int capacity) {
        items = new Object[capacity];
        size = 0;
    }

    public void add(P item) {
        if (size == items.length) {
            increase_сapacity();
        }
        items[size] = item;
        size++;
        System.out.println("Был добавлен: " + item);
    }

    public P get(int index) {
        element_index(index);
        return (P) items[index];
    }

    public P remove(int index) {
        element_index(index);
        P removedItem = get(index);

        for (int i = index; i < size - 1; i++) {
            items[i] = items[i + 1];
        }

        items[size - 1] = null;
        size--;
        System.out.println("Был удалён: " + removedItem);
        return removedItem;
    }

    public void addAll(Collection<P> collection) {
        for (P item : collection) {
            add(item);
        }
    }

    private void element_index(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Ошибочный индекс: " + index);
        }
    }

    private void increase_сapacity() {
        Object[] newItems = new Object[items.length * 2];
        System.arraycopy(items, 0, newItems, 0, size);
        items = newItems;
    }

    public int size() {
        return size;
    }
}