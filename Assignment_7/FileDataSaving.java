import java.io.*;
import java.util.*;

class Book{

	String title ;
	int id;
	Book(String title,int id)
	{
		this.title = title ;
		this.id = id ;
	}
}	

class FileDataSaving{

	static ArrayList<Book> bookDetails = new ArrayList<Book>();
	public static void initData(){
		bookDetails.add(new Book("Book1",1));
		bookDetails.add(new Book("Book2",2));
		bookDetails.add(new Book("Book3",3));
		bookDetails.add(new Book("Book4",4));
		bookDetails.add(new Book("Book5",5));
	}

	public static void main(String[] args) throws Exception {
		
		initData();

		FileWriter fw = null;

		File f = new File("bookDetails.csv");
		String finalData = "";

		for(Book b : bookDetails)
			finalData += "[ " + b.title + " , " + b.id + " ]\n";
		
		try{
			fw = new FileWriter(f);	
			fw.write(finalData.toCharArray());
			System.out.println("Data stored in File Successfuly");
		}
		catch(Exception e){ // throws IOException
			System.out.println(e);
		}
		finally{
			fw.close();
		}
	}
}
