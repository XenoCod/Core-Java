import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
	public static void main(String[] args) {
		BlockingQueue<String> q= new ArrayBlockingQueue<>(1024);
		OrderProducer ob1= new OrderProducer(q);
		OrderConsumer ob2 = new OrderConsumer(q);
		
		new Thread(ob1).start();
		new Thread(ob2).start();

		
		
	}
}
