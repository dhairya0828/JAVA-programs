import java.util.*;
import java.io.*;

class ListMover{


	static String getSubject(Scanner key){
		System.out.print("Please Enter correct Subject name : ");
		key.nextLine();
		return key.nextLine().toUpperCase();
	}
	static void printLists(ArrayList<String> subjects, ArrayList<String> selectedSubjects){
		
		System.out.println("\nsubjects");
		for(String s : subjects)
				System.out.println(s);

		System.out.println("\nSelectedSubjects");
		for(String s : selectedSubjects)
			System.out.println(s);
	}

	public static void main(String[] args) throws Exception{
		
//		ListMover lm = new ListMover(); class ListMover
		System.out.println(lm.getClass());
		ArrayList<String> subjects = new ArrayList<String>();
		ArrayList<String> selectedSubjects = new ArrayList<String>();
//		System.out.println(subjects.getClass()); class java.util.ArrayList

		while(true){

			System.out.println("");
			System.out.println("1 : Add new Subject");
			System.out.println("2 : Select Subject and add in new list");
			System.out.println("3 : Display Both list");
			System.out.println("4: Exit");
			System.out.println("");
			System.out.print("Enter Choice : ");

			Scanner key = new Scanner(System.in);
			int ch = key.nextInt();

			switch(ch){
				case 1 : subjects.add(getSubject(key));
						 System.out.println("Subject added Successfully");
						 break;

				case 2 : String sub = getSubject(key);
						 if(subjects.remove(sub) == true){
						 	selectedSubjects.add(sub);	
						 	System.out.println("Subject moved Successfully");
						 }
						 else
						 	System.out.println("Subject Does not exists");
						 break ;

				case 3 : printLists(subjects,selectedSubjects);break;
				case 4 : System.exit(0);
			}
		}
	}

}