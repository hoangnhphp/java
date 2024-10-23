import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {}

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        size++;
        Object[] newElements;
        if (elements == null) {
            newElements = new Object[1];
            newElements[0] = element;
        } else {
            newElements = new Object[elements.length + 1];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            newElements[elements.length] = element;
        }
        elements = newElements;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        size = size - 1;
        Object[] newElements = new Object[size];
        for (int i = 0, k = 0; i < elements.length; i++) {
            if (i == index) {
                continue; // Bỏ qua phần tử tại vị trí cần xóa
            }
            newElements[k++] = elements[i]; // Sao chép các phần tử còn lại
        }
        elements = newElements;
        return (E) newElements[index];
    }

    public int size() {
        return size;
    }

    public E clone() {
        E[] newElements = (E[]) elements.clone();
        return (E) newElements;
    }

    boolean contains(E element) {
        E[] newElements = (E[]) elements.clone();
        for (int i = 0; i < newElements.length; i++) {
            if (newElements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    int indexOf(E element) {
        E[] newElements = (E[]) elements.clone();
        for (int i = 0; i < newElements.length; i++) {
            if (newElements[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    boolean add(E element) {
        add(size, element);
        return true;
    }

    void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            grow(minCapacity);
        }
    }

    public Object[] grow(int minCapacity) {
        int oldCapacity = elements.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 3 / 2 + 1;

            return elements = Arrays.copyOf(elements, newCapacity);
        } else {
            return elements;
        }
    }

    E get(int index) {
        return (E) elements[index];
    }

    void clear() {
        E[] newElements = (E[]) elements.clone();
        for (int i = 0; i < newElements.length; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    private Object[] grow() {
        return grow(size + 1);
    }

    public String toString() {
        return Arrays.toString(elements);
    }
}
