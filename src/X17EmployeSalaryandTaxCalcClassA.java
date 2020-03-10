import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class X17EmployeSalaryandTaxCalcClassA {

	InputStreamReader inputStreamReader=new InputStreamReader(System.in);
	BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
	
	public int getSalary() throws Exception{
	int totalSalary=0;
		for(int j=0;j<12;j++){
			System.out.println("enter the salary for month"+(j+1));
			int salary=Integer.parseInt(bufferedReader.readLine());
			totalSalary=salary+totalSalary;
		}
		return totalSalary;
		
	}
	public float taxCalculation(int totalS,int i){
		float taxAmount=0;
		int rem=0;
		if(totalS<300000){
			taxAmount=0;
		
		}
		else if(totalS>=300000&&totalS<500000){
			rem=totalS-300000;
		    
			taxAmount=(rem*10)/100;
		}
		else if(totalS>=500000&&totalS<800000)
		{
			rem=totalS-500000;
		
			taxAmount=(rem*20)/100;
			taxAmount=taxAmount+20000;
		}else if(totalS>=800000&&totalS<1000000){
			rem=totalS-800000;
			taxAmount=(rem*30)/100;
			taxAmount=taxAmount+20000+60000;
		}
		else if(totalS>=1000000){
			rem=totalS-1000000;
			taxAmount=(rem*40)/100;
			taxAmount=taxAmount+20000+60000+60000;
		}
		return taxAmount;
		}
	public static void main(String[] args) throws Exception {
		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		X17EmployeSalaryandTaxCalcClassA objTaxClassA=new X17EmployeSalaryandTaxCalcClassA();
		System.out.println("Enter number of employe to calculate tax for a year");
		int noOfEmploye=Integer.parseInt(bufferedReader.readLine());
		X17EmployeSalaryandTaxCalcClassB objTaxClassBArray[]=new X17EmployeSalaryandTaxCalcClassB[noOfEmploye];
		for(int i=0;i<noOfEmploye;i++){
			System.out.println("enter the employee id for employee"+(i+1));
			int employeId=Integer.parseInt(bufferedReader.readLine());
			int totalS=objTaxClassA.getSalary();
			float taxA=objTaxClassA.taxCalculation(totalS,i);
			X17EmployeSalaryandTaxCalcClassB objTaxClassB=new X17EmployeSalaryandTaxCalcClassB(totalS,taxA,employeId);
			objTaxClassBArray[i]=objTaxClassB;
		}
		for(int j=0;j<noOfEmploye;j++){
			System.out.println("employe"+(j+1)+ "id number is"+objTaxClassBArray[j].emplyId );
			System.out.println("employe"+(j+1)+"total salary per year is"+objTaxClassBArray[j].totalSal);
			System.out.println("employe"+(j+1)+"total tax is"+objTaxClassBArray[j].taxAmt);
		}
	}

}
