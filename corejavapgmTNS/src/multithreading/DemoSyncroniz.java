package multithreading;

public class DemoSyncroniz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        synchronized void display() {
	        Thread g=Thread.currentThread();
	        for(int i=0;i<=3;i++) {
	                try {
	                        Thread.sleep(3000);
	                        System.out.println(g.getName()+" "+i);
	                }
	        catch(Exception e) {
	        }
	}
	}
	}

	
