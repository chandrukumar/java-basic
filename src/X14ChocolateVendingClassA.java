import java.io.InputStreamReader;
import java.io.BufferedReader;
public class X14ChocolateVendingClassA {
	public static void main(String[] args)throws Exception {
		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader); 
		X14ChocolateVendingClassB chocolateClassB= new X14ChocolateVendingClassB();
		System.out.println("Enter 1 for Customer and 2 for Retailer");
		int value=Integer.parseInt(bufferedReader.readLine());
		switch(value)
		{
		case 1:
			chocolateClassB.customer();
			break;
		case 2:
			chocolateClassB.retailer();
			break;
		default :
			System.out.println("entered number is not 1 or 2");
		break;
		}
	}

}
