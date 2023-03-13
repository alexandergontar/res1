public class Box<T> {    
    private T[] array;

    public void setArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        return array;
    }

    public void dispArray(T[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
