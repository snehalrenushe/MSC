public class Singleton {
	private static Singleton Instance;

	private Singleton() {
		System.out.println("Instance has been created !!!!");
	}

	public static Singleton getInstance() {

		if (Instance == null) {
			synchronized (Singleton.class) {
				if (Instance == null) {
					Instance = new Singleton();
				}
			}
		}
		return Instance;
	}

	public static void main(String args[]) {
		Thread T1 = new Thread(new Runnable() {
			public void run() {
				Singleton obj = Singleton.getInstance();
			}
		});

		Thread T2 = new Thread(new Runnable() {
			public void run() {
				Singleton obj = Singleton.getInstance();
			}
		});

		T1.start();
		T2.start();
	}
}