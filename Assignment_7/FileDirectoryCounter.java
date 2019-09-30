import java.io.*;

class FileDirectoryCounter{

	public static void main(String[] args) throws Exception{
		File F = new File(args[0]);

		if(F.isDirectory()){
			int dirCnt=0,fileCnt=0;
			File[] list = F.listFiles();
		//	String[] ss = F.list();
		//	int k=0;
			for(File f : list){
			//	System.out.println(f);        
			//	System.out.println(ss[k++]);
			//	f = new File(args[0]+"\\"+ss[k++]); 
				if(f.isDirectory()) // need to provide path to use this method as shown above 
					dirCnt++;
				else if(f.isFile())
					fileCnt++;
			}
			System.out.println("Total Directories : " + dirCnt);
			System.out.println("Total FIles : " + fileCnt);
		}
		else
			System.out.println("Not a Valid Directory Entered !!");
	}
}