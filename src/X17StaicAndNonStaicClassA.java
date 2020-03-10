

import sun.org.mozilla.javascript.internal.ObjArray;

public class X17StaicAndNonStaicClassA {
	X17StaicAndNonStaicClassB objB=new X17StaicAndNonStaicClassB();
	static X17StaicAndNonStaicClassB objB1=new X17StaicAndNonStaicClassB();
	public void calculationAdd(){
		objB.add();//calling non static from non static
	}
	public static void calculationSub(){
		X17StaicAndNonStaicClassB.sub();//calling static from static
	}
	public static void calculationMul(){
		objB1.mul();//calling non static from static
	}
	public void calculationDiv(){
		X17StaicAndNonStaicClassB.div();//calling static from non static
	}
	public static void main(String[] args) {
		calculationSub();
		calculationMul();
	X17StaicAndNonStaicClassA objA=new X17StaicAndNonStaicClassA();
       objA.calculationAdd();
       objA.calculationDiv();
	}

}
