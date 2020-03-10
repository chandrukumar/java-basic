import java.io.BufferedReader;
import java.io.InputStreamReader;


public class X21AbsractionDemoStudentA {
	public static void main(String[] args) {
		try{
			X21AbsractionDemoStudentB obje=new X21AbsractionDemoStudentC();
		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		System.out.println("Enter the studnt name");
		String name=bufferedReader.readLine();
		System.out.println("enter the rollno");
		long rollno=Long.parseLong(bufferedReader.readLine());
		obje.printDetails(name, rollno);
		}catch(Exception ex){
			System.out.println("error occured");
		}
		
		
	}

}
