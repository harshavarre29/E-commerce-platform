// This class implements the Queue
public class Queue<V> implements QueueInterface<V>{

    //TODO Complete the Queue implementation
    private NodeBase<V>[] queue;
    private int capacity;
    private int currentSize=0;
    private int  front=0;
    private int rear=0;
    public Queue(int capacity)
    {
      this.capacity=capacity;
      queue=new NodeBase[capacity];
    }

    public int size()
    {
      return this.capacity;
    }

    public boolean isEmpty()
    {
      if(currentSize==0)
      return true;
      return false;
    }

    public boolean isFull()
    {
      if(currentSize==capacity)
      return true;
      return false;
    }

    public void enqueue(Node<V> node) {
      if(isFull()){

      }
      else{
      rear=(rear+1)%capacity;
      queue[rear]=node;
      currentSize++;
      }
    }

    public NodeBase<V> dequeue() {
      if(isEmpty()){

      }
      else{
        NodeBase<V> deq=queue[front];
        front=(front+1)%capacity;
        currentSize--;
        return deq;
      }

    }

}
