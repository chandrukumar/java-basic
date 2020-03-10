
public class X10StudentTotalClassBForConstructor {
	int marks[];
	public X10StudentTotalClassBForConstructor(int[] mark){
	
	marks = mark;
	}
	public void total(){
	int total=marks[0]+marks[1]+marks[2]+marks[3];
	System.out.println("your total is"+total);
	}

}
