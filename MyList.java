import java.util.Arrays;

public class MyList {
    private int[] array;
    private int size;

    public MyList() {
        this.array = new int[100];
        this.size = 0;
    }

    private void resize(int newCapacity) {
        array = Arrays.copyOf(array, newCapacity);
    }

    public void add(int value) {
        if (size == array.length) {
            resize(2 * array.length);
        }
        array[size++] = value;
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        array[size] = 0;
        if (size > 0 && size == array.length / 4) {
            resize(array.length / 2);
        }
    }

    public void deleteByValue(int value) {
        int index = indexOf(value);
        if (index != -1) {
            deleteByIndex(index);
        }
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return array[index];
    }

    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, size));
    }

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        System.out.println(myList); // Output: [10, 20, 30]

        myList.deleteByIndex(1);
        System.out.println(myList); // Output: [10, 30]

        myList.deleteByValue(10);
        System.out.println(myList); // Output: [30]

        System.out.println(myList.get(0)); // Output: 30
    }
}
