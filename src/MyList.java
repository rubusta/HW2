import java.util.*;

public class MyLinkedList implements List<LinkedList> {

    private String name;
    public MyLinkedList(String value){

        name=value;
    }
    String getName(){return name;}




    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<LinkedList> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(LinkedList linkedList) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends LinkedList> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends LinkedList> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public LinkedList get(int index) {
        return null;
    }

    @Override
    public LinkedList set(int index, LinkedList element) {
        return null;
    }

    @Override
    public void add(int index, LinkedList element) {

    }

    @Override
    public LinkedList remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<LinkedList> listIterator() {
        return null;
    }

    @Override
    public ListIterator<LinkedList> listIterator(int index) {
        return null;
    }

    @Override
    public List<LinkedList> subList(int fromIndex, int toIndex) {
        return null;
    }
}
