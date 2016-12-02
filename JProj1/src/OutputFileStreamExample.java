import java.io.FileOutputStream;

public class OutputFileStreamExample {

	public static void main(String[] args) {
		try
		{
			FileOutputStream outFile = new FileOutputStream("D:FileRepositoryOutput.txt");
		
			String str = "Write it into the file";
			byte b[] = str.getBytes();
			outFile.write(b);
			
			outFile.close();
			System.out.println("File updates completed");
		}
		
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
				
	}
}
