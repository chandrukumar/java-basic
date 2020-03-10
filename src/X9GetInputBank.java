import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class X9GetInputBank {
	
static float currentamount=0;
public static void deposit() throws Exception{
	InputStreamReader inputStreamReader= new InputStreamReader(System.in);
	BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
	System.out.println("enter the deposit amount");
	float depositamount=Float.parseFloat(bufferedReader.readLine());
if(depositamount>0){
	currentamount=currentamount+depositamount;
	System.out.println("you deposited"+depositamount);
	System.out.println("your current balance is"+currentamount);
}
else
	System.out.println("give correct deposit amount");
}
public static void withDraw() throws Exception{
	InputStreamReader inputStreamReader=new InputStreamReader(System.in);
	BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
	System.out.println("enter the withdraw amount");
	float withdrawamount=Float.parseFloat(bufferedReader.readLine());
	if(withdrawamount>0){
	if(currentamount>=withdrawamount){
		currentamount=currentamount-withdrawamount;
		System.out.println("take your cash"+withdrawamount);
		System.out.println("your current balance is"+currentamount);
		
	}
	else
	{
		System.out.println("you can't withdraw"+withdrawamount);
		System.out.println("your current balance is"+currentamount);
	}
	}
	else
		System.out.println("withdraw amount should be more than zero");
}
public static void main(String[] args) throws Exception {
	InputStreamReader inputStreamReader=new InputStreamReader (System.in);
	BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
	System.out.println("enter 1 for deposit & 2 for withdraw");
	int userValue = Integer.parseInt(bufferedReader.readLine());
	switch(userValue)
	{
	case 1:
		deposit();
		break;
	case 2:
		withDraw();
		break;
	default:
		System.out.println("type the correct number");
	break;
	}

}
}