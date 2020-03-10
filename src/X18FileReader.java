import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class X18FileReader {
	public static void main(String[] args) throws Exception {
		File file =new File("12345.txt");
	    FileInputStream reader=new FileInputStream(file);
	    int value;
	    String readed="";
	    while((value=reader.read())>0)
	    {
	    	
	    	readed=readed+(char)value;
	    }
	    System.out.println(readed);
		
	}

}
