
public class X7BankGlobalDeclaration {
	
static float currentamount=0;
public static void deposit(float depositamount){
if(depositamount>0){
	currentamount=currentamount+depositamount;
	System.out.println("you deposited"+depositamount);
	System.out.println("your current balance is"+currentamount);
}
else
	System.out.println("give correct deposit amount");
}
public static void withDraw(float withdrawamount){
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
public static void main(String[] args) {
	deposit(0);
	deposit(500);
	withDraw(0);
	withDraw(5000);
	withDraw(200);
}

}
