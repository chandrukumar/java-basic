import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class X16StudentManyObjectClassAUNFINISHED {
	static InputStreamReader inputStreamReader=new InputStreamReader(System.in);
    static	BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
    public static X16StudentManyObjectClassBUNFINISHED generalDetails() throws Exception{
    	int noOfStudents =0;
        int noOfSubjects=0;
    	
    	System.out.println("enter the name");
	String name=bufferedReader.readLine();
	System.out.println("enter the age");
	int age=Integer.parseInt(bufferedReader.readLine());
	System.out.println("enter the gender");
    String gender=bufferedReader.readLine();
    System.out.println("enter the rollno");
    long rollno=Long.parseLong(bufferedReader.readLine());
    int[] markArray = marks();
    int total = total(markArray);
    float avg = avg(total,noOfSubjects);
    	X16StudentManyObjectClassBUNFINISHED classB = new X16StudentManyObjectClassBUNFINISHED(name,age,rollno);
	return classB;	
    }
	public static int[] marks(){
	return null;
	}
	public static int total(int[] marks){
		return 0;
	}
	public static float avg(int total,int noOfSub){
		return total/noOfSub;
	}

	public static void main(String[] args) throws Exception {
		
		System.out.println("enter the number of students");
		int noOfStudents=Integer.parseInt(bufferedReader.readLine());
		System.out.println("enter the number of subjects");
		int noOfSubjects=Integer.parseInt(bufferedReader.readLine());
		X16StudentManyObjectClassBUNFINISHED[] classBsArray = new X16StudentManyObjectClassBUNFINISHED[noOfStudents];
		for(int i=0;i<=noOfStudents;i++){
			X16StudentManyObjectClassBUNFINISHED objectClassB = generalDetails();
			
			classBsArray[i]= objectClassB;
		}
		
		for(int j=0;j<classBsArray.length;j++){
			//classBsArray[j].
		}
	}


}
