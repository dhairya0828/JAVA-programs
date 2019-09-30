class Printer{

	synchronized public void printContent(String contentToPrint){

		System.out.println("");
		System.out.println("Printing Job");
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Content : " + contentToPrint);
		System.out.println("Job Printed");
		System.out.println("");
	}
}

class User extends Thread { // implements Runnable 

	String contentToPrint;
	Printer printerNum;
	User(String contentToPrint,Printer printerNum){
		this.contentToPrint = contentToPrint;
		this.printerNum = printerNum ;
		Thread thread = new Thread(this);
		thread.start();
	}
	public void run(){
		printerNum.printContent(contentToPrint);
	}
}

class PretyPrinter {
	
	public static void main(String[] args) {
		Printer p1 = new Printer();
		User u1 = new User("Hello World !",p1); // printng Completely
		User u2 = new User("How are you !",p1);
		User u3 = new User("It's I, Dhairya",p1);
	}
}

