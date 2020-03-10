import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class X14ChocolateVendingClassB {
	float type1Price=10;
	float type2Price=20;
	float type3Price=30;
	int noOfChocolates;
	float priceOfTotalChocolates;
	float balanceAmount;
	InputStreamReader inputStreamReader=new InputStreamReader(System.in);
	BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
	public void customer()throws Exception{
		System.out.println("enter the chocolate type that you need");
		System.out.println("if chocolate type1 enter 1");
		System.out.println("if chocolate type2 enter 2");
		System.out.println("if chocolate type3 enter 3");
		int chocolateType=Integer.parseInt(bufferedReader.readLine());
		switch (chocolateType){
		case 1:
			System.out.println("The cost of the unit chocolate you selected is "+type1Price+"rupee");
			System.out.println("enter how much chocolate do you need");
			 noOfChocolates=Integer.parseInt(bufferedReader.readLine());
            priceOfTotalChocolates=noOfChocolates*type1Price;
            System.out.println("cost of"+noOfChocolates+"is"+priceOfTotalChocolates+"rupee");
			System.out.println("please enter your amount to buy a chocolate");
			float customerAmount=Float.parseFloat(bufferedReader.readLine());
			if(customerAmount>=priceOfTotalChocolates){
				 balanceAmount=customerAmount-priceOfTotalChocolates;
				if(balanceAmount==0){
					System.out.println("take your chocolate");
				}
				else
				{
					System.out.println("take your chocolate and balance amount"+balanceAmount+"rupee");
				}
			}
			else
			{
				System.out.println("you amount is not sufficient to by "+noOfChocolates+" chocolate");
			}
			
		break;
		case 2:
			System.out.println("The price of the chocolate you selected is "+type2Price+"rupee");
			System.out.println("enter how much chocolate do you need");
			 noOfChocolates=Integer.parseInt(bufferedReader.readLine());
			 priceOfTotalChocolates=noOfChocolates*type2Price;
			System.out.println("cost of"+noOfChocolates+"chocolate is"+priceOfTotalChocolates+"rupee");
			System.out.println("please enter your amount to buy a chocolate");
			 customerAmount=Float.parseFloat(bufferedReader.readLine());
			if(customerAmount>=priceOfTotalChocolates){
				 balanceAmount=customerAmount-priceOfTotalChocolates;
				if(balanceAmount==0){
					System.out.println("take your chocolate");
				}
				else
				{
					System.out.println("take your chocolate and balance amount"+balanceAmount+"rupee");
				}
			}
			else
			{
				System.out.println("you amount is not sufficient to by "+noOfChocolates+"chocolate");
			}
			
		break;
		case 3:
			System.out.println("The price of the chocolate you selected is "+type3Price+"rupee");
			System.out.println("enter how much chocolate do you need");
            noOfChocolates=Integer.parseInt(bufferedReader.readLine());
			priceOfTotalChocolates=noOfChocolates*type3Price;
			System.out.println("cost of"+noOfChocolates+"chocolate is"+priceOfTotalChocolates+"rupee");
			System.out.println("please enter your amount to buy a chocolate");
			customerAmount=Float.parseFloat(bufferedReader.readLine());
			if(customerAmount>=priceOfTotalChocolates){
				balanceAmount=customerAmount-priceOfTotalChocolates;
				if(balanceAmount==0){
					System.out.println("take your chocolate");
				}
				else
				{
					System.out.println("take your chocolate and balance amount"+balanceAmount+"rupee");
				}
			}
			else
			{
				System.out.println("you amount is not sufficient to by"+noOfChocolates+"chocolate");
			}
			
		break;
		
		}
	
		
	}
	public void retailer()throws Exception{
	System.out.println("Enter the chocolate chocolate type");
	System.out.println("To fix price for chocolate type1 please enter 1");
	System.out.println("To fix price for chocolate type2 please enter 2");
	System.out.println("To fix price for chocolate type3 please enter 3");
	int retailerValue=Integer.parseInt(bufferedReader.readLine());
	switch(retailerValue){
	case 1:
	System.out.println("enter the price for type1 chocolate");
	type1Price=Float.parseFloat(bufferedReader.readLine());
	System.out.println("the price of the type1 chocolate is fixed as"+type1Price);
	break;
	case 2:
	System.out.println("enter the price for type2 chocolate");
	type2Price=Float.parseFloat(bufferedReader.readLine());
	System.out.println("the price of the type2 chocolate is fixed as"+type2Price);
	break;
	case 3:
	System.out.println("enter the price for type3 chocolate");
	type3Price=Float.parseFloat(bufferedReader.readLine());
	System.out.println("the price of the type3 chocolate is fixed as"+type3Price);
	break;
	default:
		System.out.println("you entered the wrong chocolate type");
	break;
	
	}
		
	}

}
