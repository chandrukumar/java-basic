
public class X20EncapsulationDemoClassA {
	public static void main(String[] args) {
		X20EncapsulationDemoClassB objB= new X20EncapsulationDemoClassB();
		System.out.println(objB.userName);
		System.out.println(objB.getPasword());
		objB.userName="changed username";
	}

}
