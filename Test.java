class Test extends Thread{
  public void run() {
	  for(int i=1; i<5;i++) {
		  System.out.println("child thread running");
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  }
	  
  }
  public static void main(String[] args) {
	
Test t=new Test();
t.setPriority(MAX_PRIORITY);
try {
	t.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

   t.start();
   
   for(int i=1;i<5;i++) {
	  System.out.println("main thread running");
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
  }
}
}