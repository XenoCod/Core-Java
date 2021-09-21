import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable {
	private BlockingQueue<String> q;
	
	public OrderProducer(BlockingQueue<String> q) {
		this.q=q;
	}
	@Override
	public void run() {
		try {
			q.put("Iphone");
			q.put("Nokia");
			q.put("Samsung");
			q.put("OnePlus");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
