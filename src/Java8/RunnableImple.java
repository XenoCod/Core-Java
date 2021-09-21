package Java8;

public class RunnableImple {
	public static void main(String[] args) {
//		Runnable r= new RunnableImpl();
//		Thread t= new Thread(r);
//		t.start();

		// Lambda implmementation
		Runnable r = () -> {
			for (int i = 0; i <= 10; i++)
				System.out.println("Child Thread");
		};

		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i <= 10; i++)
			System.out.println("Main Thread");

	}
}
