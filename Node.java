// Base class for Node. Each node would be an element of the Priority Queue.
abstract class NodeBase<V> {
    protected int priority; // Priority of the node
    protected V value;	// Value stored by the node
    public abstract int getPriority(); // return the priority of the node
    public abstract V getValue();	// returns the value stored by the node
    public void show() {
	System.out.println(this.getPriority());
    }
}
public class Node<V> extends NodeBase<V> {
	int priority;
	V value;
	public Node(int priority, V value) {
		this.priority = priority;
		this.value = value;
	}

	//TODO Complete these methods
	public int getPriority() {
		return this.priority;
	}

	public V getValue() {
	return this.value;
	}
/*	public void setNext(Node<T> next)
	{
			this.next = next;
	}

	public T value()
	{
			return data;
	}
	public void setData(V value)
	 {
	     this.value = value;
	 }
	public Node<T> after()
	{
			return next;
	}*/
}
