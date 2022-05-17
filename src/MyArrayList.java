import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList implements MyArrayListInterface {
    private int size;
    private int capacity;
    private Object[] arr = new Object[0];


    @Override
    public void add(Object value) {
        if (size == capacity) {
            capacity += 1;
            arr = Arrays.copyOf(arr, capacity);
        }
        if (value != null) {
            arr[size] = value;
            size++;
        }
    }

    @Override
    public void remove(int index) {
        System.arraycopy(arr, index + 1, arr, index, size - index- 1);
        arr = Arrays.copyOf(arr, size - 1);
    }

    @Override
    public void clear() {
        arr = new Object[0];
        size = 0;
        capacity = 0;
    }

    @Override
    public int size() {
        System.out.println("size of array is: " + size);
        return size;
    }

    @Override
    public int get(int index) {
        System.out.println(arr[index]);
        return (int) arr[index];
    }

    @Override
    public String toString() {
        return "MyArrayList{" + Arrays.toString(arr) + "}";
    }
}
