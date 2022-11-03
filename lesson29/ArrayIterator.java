package lesson29;

public class ArrayIterator<T> {
    //Написать итератор для массива(только методы hasNext() и next())
    private T[] arr;
    private int index;
    ArrayIterator(T [] mas){
        arr = mas;
        index = -1;

    }
    public  boolean hasNext(){
        return (index < arr.length);

    }
    public  T next() throws IndexOutOfBoundsException {
        if (!hasNext()){
            //исключение
            throw new IndexOutOfBoundsException("Index out of array bounds");
        }
         return arr[index++];
    }
}
