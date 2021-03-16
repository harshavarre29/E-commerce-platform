import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Seller<V> extends SellerBase<V> {

    public Seller (int sleepTime, int catalogSize, Lock lock, Condition full, Condition empty, PriorityQueue<V> catalog, Queue<V> inventory) {
        //TODO Complete the constructor method by initializing the attributes
        // ...
				this.catalog=catalog;
        this.setSleepTime(sleepTime);
				this.lock=lock;
				this.full=full;
				this.empty=empty;
				this.inventory=inventory;
    }

    public void sell() throws InterruptedException {
	try {
            //TODO Complete the try block for produce method
            // ...

            this.lock.lock();

            while(catalog.isFull() ){
            	full.await();
			}
if(this.inventory.size()!=0){

            NodeBase<V> x=inventory.dequeue();
			catalog.enqueue((Node<V>)x);}
            empty.signalAll();



	} catch(Exception e) {
            e.printStackTrace();
	} finally {
            //TODO Complete this block
						this.lock.unlock();
	}
    }
}

