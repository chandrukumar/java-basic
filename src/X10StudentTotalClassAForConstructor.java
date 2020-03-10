
public class X10StudentTotalClassAForConstructor {
public static void main(String[] args) {
	int mark[];
	mark= new int[4];
	mark[0]=100;
	mark[1]=100;
	mark[2]=100;
	mark[3]=100;
	X10StudentTotalClassBForConstructor objClassB=new X10StudentTotalClassBForConstructor(mark);
	objClassB.total();
}
}

