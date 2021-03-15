
public class PriorityQueue<V> implements QueueInterface<V>{

    private NodeBase<V>[] queue;
    private int capacity;
    private int currentSize=0;
    private int front=0;
    int rear=0;
    //TODO Complete the Priority Queue implementation
    // You may create other member variables/ methods if required.
    public PriorityQueue(int capacity) {
        this.capacity=capacity;
    }
    public PriorityQueue(){
      this.queue =new Node[capacity];
    }

    public int size() {
      return this.currentSize;
    }

    public boolean isEmpty() {
      if(currentSize==0)
      return true;
      return false;
    }

    public boolean isFull() {
    	return this.currentSize==this.capacity;
    }
    public void add(int priority,V value) {
      Node<V> node =new Node<V>(priority,value);
      this.enqueue(node);
//      if(this.isEmpty())
//      {
//    	  System.out.println(node.getPriority());
//    	  this.queue[currentSize]=node;
//      System.out.println(queue[0].getPriority());
//      }
//      else{
//      for(int i=0;i<currentSize-1;i++)
//      {
//        if(queue[i].getPriority()>(node.getPriority())){
//          for(int j=currentSize-1;j>i;j--)
//          {
//            queue[j]=queue[j-1];
//          }
//          queue[i]=node;
//          break;
//        }
//      }
//      currentSize++;
//      System.out.println(node.getPriority());
    }

    public void enqueue(Node<V> node) {
      if(this.isFull())
      {
    	  System.out.println("Kya kar rha hai bhai");
      }
       else
      {
    	      queue[rear]=node;
    	      rear=(rear+1)%capacity;
    	      currentSize++;


      for(int i=0;i<capacity-1;i++)
      {
        if(queue[i].getPriority()>(node.getPriority())){
          for(int j=currentSize-1;j>i;j--)
          {
            queue[j]=queue[j-1];
          }
          queue[i]=node;
          break;
        }
      }

      }

    }


    // In case of priority queue, the dequeue() should
    // always remove the element with minimum priority value
    public NodeBase<V> dequeue() {

      if(this.isEmpty())
      {
    	  return null;
      }
      else {
    	  NodeBase<V> deq=queue[front];
        front=(front+1)%capacity;
        currentSize--;
        System.out.println(deq.getPriority());
        return deq;
      }
    }





    public void display () {
	if (this.isEmpty()) {
            System.out.println("Queue is empty");
	}
	for(int i=0; i<currentSize; i++) {
            queue[i+1].show();
	}
    }
}
