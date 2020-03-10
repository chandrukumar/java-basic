
public class X4ReturnValueAverage {
	public static int add(int a,int b,int c)
	{
		int d=a+b+c;
		return d;
	}
	public static void avg(int e,int id){
		float avg =(float)e/3;
		System.out.println("avg of student"+id+":"+avg);
	}
public static void main(String[] args) {
	int stdId=1;
	int retval1 =add(17,20,30);
	avg(retval1,stdId);
	stdId++;
	int retval2 =add(45,37,20);
	avg(retval2,stdId);
	
}

}
