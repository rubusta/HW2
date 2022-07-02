import java.util.*;

public class MyList implements List<Integer>, Deque<Integer> {

    private final String name;

    public MyList(String value) {

        name = value;
    }

    public String getName() {
        return name;
    }

    private static class Node<E> {
        public Integer element;
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element) {
            this.item = element;
            this.prev = prev;
        }
    }

    public int element;
    public Node<Integer> first;
    public Node<Integer> last;
    public int size;


    @Override
    public void addLast(Integer integer) {
        final Node<Integer> l = last;
        final Node<Integer> newNode = new Node<>(l, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    @Override
    public void addFirst(Integer integer) {
        final Node<Integer> f = first;
        final Node<Integer> newNode = new Node<>(f, null);
        first = newNode;
        if (f == null)
            last = newNode;
        else
            f.prev = newNode;
        size++;
    }


    @Override
    public boolean offerFirst(Integer integer) {
        return false;
    }

    @Override
    public boolean offerLast(Integer integer) {
        return false;
    }

    @Override
    public Integer removeFirst() {
        return null;
    }

    @Override
    public Integer removeLast() {
        return null;
    }

    @Override
    public Integer pollFirst() {
        return null;
    }

    @Override
    public Integer pollLast() {
        return null;
    }

    @Override
    public Integer getFirst() {
        final Node<Integer> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return f.item;
    }

    @Override
    public Integer getLast() {
        final Node<Integer> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return l.item;
    }

    @Override
    public Integer peekFirst() {
        return null;
    }

    @Override
    public Integer peekLast() {
        final Node<Integer> l = last;
        return (l == null) ? null : l.item;
    }


    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean offer(Integer integer) {
        return false;
    }

    @Override
    public Integer remove() {
        return null;
    }

    @Override
    public Integer poll() {
        return null;
    }

    @Override
    public Integer element() {
        return null;
    }

    @Override
    public Integer peek() {
        return null;
    }

    @Override
    public void push(Integer integer) {

    }

    @Override
    public Integer pop() {
        return null;
    }

    @Override
    public Iterator<Integer> descendingIterator() {
        return null;
    }

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
    public Iterator<Integer> iterator() {
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
    public boolean add(Integer integer) {
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
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
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
        first = null;
        last = null;
        size = 0;

    }

    @Override
    public Integer get(int index)  {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }

        return result.element;
    }

    @Override
    public Integer set(int index, Integer element) {

        Node<Integer> x = node(index);
        Integer oldVal = x.item;
        x.item = element;
        return oldVal;
    }

    private Node<Integer> node(int index) {
        return null;
    }


    @Override
    public void add(int index, Integer element) {

    }

    @Override
    public Integer remove(int index) {
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
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }


}

