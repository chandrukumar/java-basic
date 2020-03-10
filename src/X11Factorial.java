import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class X11Factorial {
	public static void main(String[] args) throws Exception {
		int upnumber=1;
		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader bufferedReader =new BufferedReader(inputStreamReader);
		System.out.println("enter the number to get factorial");
		int number=Integer.parseInt(bufferedReader.readLine());
	for(int i=1;i<=number;i++){
		upnumber=i*upnumber;
	}
	System.out.println("factorial is"+upnumber);

	}

}
