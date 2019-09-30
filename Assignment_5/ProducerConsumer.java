class Q{
	
	int n;
	boolean available = false ;

	synchronized void putElement(int n){

		this.n = n ;
		while(available){
			try{
				wait();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("\nProducer : " + n );
		available = true ;
		notify();
	} // end of putElement 
	;
	  int getElement(){

		while(!available){
			try{
				wait();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("Consumer : " + n);
		available = false; 
		notify();
		return n ;

	} // End of getElement 

} // end of class Q

class Producer implements Runnable{
	Q queue;
	Producer(Q queue){
		this.queue = queue ;
		Thread thread1 = new Thread(this);
		thread1.start();
	}

	public void run(){
		int i=0;
		while(true){
			queue.putElement(i++);
			System.out.println(queue.n);
			try{
				Thread.sleep(500);
			}
			catch(Exception e){
				
				e.printStackTrace();
			}
		}
	}

} // End of class Producer

class Consumer implements Runnable{
	Q queue;
	Consumer(Q queue){
		this.queue = queue ;
		Thread thread2 = new Thread(this);
		thread2.start();
	}

	public void run(){
		
		while(true){
			int temp = queue.getElement();
			try{
				Thread.sleep(500);
			}
			catch(Exception e){
			
				e.printStackTrace();
			}
		}
	}
} // End of class Consumer

class ProducerConsumer{

	public static void main(String[] args) {
		 Q queue1 = new Q();
		 queue1.n = 0 ;
		 Producer p1 = new Producer(queue1);
		 Consumer c1 = new Consumer(queue1);
	}
}