import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import sun.org.mozilla.javascript.internal.ObjArray;


public class X16StudentManyObjectClassAFINISHED {
	static InputStreamReader inputStreamReader=new InputStreamReader(System.in);
	static BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
	static int noOfSubjects;
	static int i;
	static int mark[];
	static float avg;
	static int noOfStudents;


	public static void  marks() throws Exception{
      mark=new int[noOfSubjects];
		for(int j=0;j<noOfSubjects;j++)
		{
			System.out.println("enter the mark of subject"+(j+1)+ "for student"+(i+1));
		mark[j] = Integer.parseInt(bufferedReader.readLine());
	
		
		}
		
	}
	public static int total(){
		int total=0;
		for(int k=0;k<noOfSubjects;k++){
			total=total+mark[k];
		}
		return total;
	}
	public static void avg(int total){
		 avg=total/noOfSubjects;
		
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("Enter the number of students");
		noOfStudents=Integer.parseInt(bufferedReader.readLine());
		System.out.println("Enter the number of subjects ");
		noOfSubjects=Integer.parseInt(bufferedReader.readLine());
		X16StudentManyObjectClassBFINISHED objArray[]=new X16StudentManyObjectClassBFINISHED[noOfStudents];
		for(i=0;i<noOfStudents;i++){
			System.out.println("Enter the name of student"+(i+1));
			String name=bufferedReader.readLine();
			System.out.println("Enter the age of student"+(i+1));
			int age=Integer.parseInt(bufferedReader.readLine());
			System.out.println("Enter gender of student"+(i+1));
			String gender=bufferedReader.readLine();
			System.out.println("Enter the roll no.of student"+(i+1));
			long rollno=Long.parseLong(bufferedReader.readLine());
		marks();
		int tot=total();
		avg(tot);
		X16StudentManyObjectClassBFINISHED finObjB=new X16StudentManyObjectClassBFINISHED(name,age,gender,rollno,mark,tot,avg);
			objArray[i]=finObjB;
		}
		for(int k=0;k<noOfStudents;k++){
			System.out.println("name of student"+(k+1)+"is"+objArray[k].nam);
			System.out.println("age of student"+(k+1)+"is"+objArray[k].ag);
			System.out.println("roll no of student"+(k+1)+"is"+objArray[k].rolln);
			System.out.println("gender of student"+(k+1)+"is"+objArray[k].gende);
			for(int b=0;b<objArray[k].mar.length;b++){
		    	 System.out.println("mark "+(b+1)+"is"+objArray[k].mar[b]);
		     }

			System.out.println("total of student"+(k+1)+"is"+objArray[k].tota);
			System.out.println("avg is of student"+(k+1)+"is"+objArray[k].av);
			
		}
		
	
		
	}
	

}
