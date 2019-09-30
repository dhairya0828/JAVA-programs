import java.io.*;

class WorkingWIthBinaryFIle{
	
	public static void main(String[] args) throws Exception{
		
	//	File f = new File("audi.jpg");
	//	File c = new File("copied audi.png"); // .jpg aslo works

		File f = new File("ironman.png");
		File c = new File("Copied ironman.png");
		
		FileInputStream fis = null ;
		FileOutputStream fos = null ;
		try{
			fis = new FileInputStream(f);
			fos = new FileOutputStream(c);
			
			byte[] dataChunk = new byte[1024]; 
			// fis.read(dataChunk); gives unsupported image as a result 
			while(fis.read(dataChunk)!=-1)
				fos.write(dataChunk);

			System.out.println("Binary File Copied Successfuly");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally{
			fis.close();
			fos.close();
		}
	}
}