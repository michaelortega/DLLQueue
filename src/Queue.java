
public interface Queue<T> {
    public void enqueue(T value);
    public T dequeue();
    public T peek();
    public int size();
}
