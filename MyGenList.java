import java.util.Arrays;
import java.util.Objects;

public class MyGenList<T> {
    private Object[] array;
    private int size;

    public MyGenList() {
        this.array = new Object[100];
        this.size = 0;
    }

    private void resize(int newCapacity) {
        array = Arrays.copyOf(array, newCapacity);
    }

    public void add(T value) {
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
        array[size] = null;
        if (size > 0 && size == array.length / 4) {
            resize(array.length / 2);
        }
    }

    public void deleteByValue(T value) {
        int index = indexOf(value);
        if (index != -1) {
            deleteByIndex(index);
        }
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }

        @SuppressWarnings("unchecked")
        T value = (T) array[index];
        return value;
    }

    public int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
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
        MyGenList<Integer> intList = new MyGenList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        System.out.println(intList); // Output: [10, 20, 30]

        intList.deleteByIndex(1);
        System.out.println(intList); // Output: [10, 30]

        intList.deleteByValue(10);
        System.out.println(intList); // Output: [30]

        System.out.println(intList.get(0)); // Output: 30

        MyGenList<String> stringList = new MyGenList<>();
        stringList.add("Hello");
        stringList.add("World");
        System.out.println(stringList); // Output: [Hello, World]

        MyGenList<MyClass> customList = new MyGenList<>();
        customList.add(new MyClass(1, "First"));
        customList.add(new MyClass(2, "Second"));
        System.out.println(customList); // Output: [MyClass{id=1, name='First'}, MyClass{id=2, name='Second'}]
    }

    static class MyClass {
        private int id;
        private String name;

        public MyClass(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "MyClass{id=" + id + ", name='" + name + "'}";
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }
}
