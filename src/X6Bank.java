
public class X6Bank {
	public static float deposit(float currentamount,float depositamount){
	currentamount =currentamount+depositamount;
	System.out.println("your deposited amount is "+depositamount+"and current is"+currentamount);
	return currentamount;
	}
	public static float withDraw(float currentamount,float withdrawamount){
		if(currentamount>=withdrawamount){
		currentamount=currentamount-withdrawamount;
		System.out.println("take your cash"+withdrawamount+" your current balance is"+currentamount);
		}
		else{
	    System.out.println("you have no sufficient balance to withdraw"+withdrawamount);
		System.out.println("your current balance is "+currentamount);
		}
		return currentamount;
	}
	public static void main(String[] args) {
	     float	currentamount=0;
		currentamount=deposit(currentamount,500);
		currentamount=withDraw(currentamount,500);
		withDraw(currentamount,5000);
		
	}
}