import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class X12NoOfOdd {
	public static void main(String[] args) throws Exception {
	InputStreamReader inputStreamReader= new InputStreamReader(System.in);
	BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
	System.out.println("to find odd between number");
	System.out.println("enter the starting number");
	int fNumber=Integer.parseInt(bufferedReader.readLine());
	System.out.println("enter the ending number ");
	int eNumber=Integer.parseInt(bufferedReader.readLine());
   for(;fNumber<=eNumber;fNumber++){
	   if(fNumber%2!=0){
		   System.out.println(+fNumber+"is odd number");
	   }
	   
   }
	}

}
