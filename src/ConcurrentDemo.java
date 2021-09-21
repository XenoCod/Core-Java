import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentDemo extends Thread{
	static CopyOnWriteArrayList<String> list= new CopyOnWriteArrayList<>();
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list.add("JavaScipt");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ConcurrentDemo obj= new ConcurrentDemo();
		obj.start();
		
		list.add("Java");
		list.add("C");
		list.add("C#");
		list.add("Docker");
		list.add("JS");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			Thread.sleep(2000);
			String t=iterator.next();
			
			if(t.equals("JS")) list.remove(t); //throws a concurent modification excptions
			System.out.println(t);
			
		}
		System.out.println(list);
	}

}
