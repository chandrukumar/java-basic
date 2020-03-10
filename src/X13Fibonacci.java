import java.io.InputStreamReader;
import java.io.BufferedReader;


public class X13Fibonacci {
	public static void main(String[] args)throws Exception {
		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		System.out.println("Enter number to start fibonacci");
		int n1=Integer.parseInt(bufferedReader.readLine());
		int n2=n1+1;
		System.out.print(+n1+","+n2);
		for(int i=0;i<10;i++)
		{
		int	n3=n1+n2;
	
		System.out.print(","+n3);
		n1=n2;
		n2=n3;
		}
	}

}
