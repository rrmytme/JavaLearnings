import java.io.FileInputStream;

public class InputSFiletream {

	public static void main(String[] args) {
		try
		{
			FileInputStream inFile = new FileInputStream("D:FileRepositoryOutput.txt");
			int i;
			while((i=inFile.read())!=-1)
            System.out.println((char) i);
			inFile.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
		
	}
}
