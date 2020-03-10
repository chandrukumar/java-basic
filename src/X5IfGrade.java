
public class X5IfGrade {
	public static int add(int mat,int tam,int eng,int soc,int sci){
		int total=mat+tam+eng+soc+sci;
		if(total<300){
			System.out.println("your total is "+total);
			System.out.println("you are failed");
		}
		else if(total>=300&&total<=400){
			System.out.println("your total is "+total);
			System.out.println("you are good");
		}
		else if(total>400&&total<=450){
			System.out.println("your total is "+total);
			System.out.println("you are very good");
			
		}
		else if(total>450&&total<=500){
			System.out.println("your total is "+total);
			System.out.println("you are Excellent");
		}
		return total;
	}
	public static void avg(float gettotal){
		float avg=gettotal/5;
		if(avg<50){
			System.out.println("your avg is "+avg);
			System.out.print("your grade is U");	
		}
		else if(avg>=50&&avg<70){
			System.out.println("your avg is "+avg);
			System.out.print("your grade is D");
			
		}
		else if(avg>=70&&avg<80){
			System.out.println("your avg is "+avg);
			System.out.print("your grade is C");
		}
		else if(avg>=80&&avg<90){
			System.out.println("your avg is "+avg);
			System.out.print("your grade is B");
		}
		else if(avg>=90){
			System.out.println("your avg is "+avg);
			System.out.print("your grade is A");
		}
	}
	public static void main(String[] args) {
		int tot=add(50,50,100,100,100);
		avg(tot);
	}

}
