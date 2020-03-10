import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;


public class X18FileWriting {
	public static void main(String[] args)throws Exception {
		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader  bufferedReader=new BufferedReader(inputStreamReader);
		File file=new File("filewritting.txt");
		FileOutputStream fop=new FileOutputStream(file);
		System.out.println("enter the passage");
		String passage=bufferedReader.readLine();
		byte[]pass=passage.getBytes();
		fop.write(pass);
		fop.flush();
		fop.close();
	}

}
