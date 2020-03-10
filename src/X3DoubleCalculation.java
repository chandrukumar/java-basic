
public class X3DoubleCalculation {
	public static double add(double a,double b){
		double c=a+b;
		System.out.println("add value="+c);
		return c;
	}
	
	public static void multiplication(double a,double b){
		double c=a*b;
		System.out.println("add value="+c);
	}
	
	public static void calculateAvg(float totalMarks,int noOfSubjects){
		float avg = totalMarks/noOfSubjects;
		System.out.println("Calculated Aveage :"+avg);
	}
	public static void main(String[] args) {
		double retnValue =  add(.345673,.93939);
		multiplication(retnValue,442);
		calculateAvg(425.76f,6);
	}

}
