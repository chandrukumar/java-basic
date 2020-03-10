import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class X10StudentGradeClassB {
	 int total;
	 int avg;
	 InputStreamReader inputStreamReader= new InputStreamReader(System.in);
     BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
	public  void total(int noOfSubjects,int noOfStudents) throws Exception{
	total=0;
		for(int j=1;j<=noOfSubjects;j++)
		{
			System.out.println("enter the mark of subject"+j+"for student"+noOfStudents);
		int mark = Integer.parseInt(bufferedReader.readLine());
		if(mark>=0){
		total=total+mark;
		}
		else
		{
			System.out.println("mark should be greater than or equal to zero");
			j=j+noOfSubjects;
		}
		}
		System.out.println("your total of student"+noOfStudents+"is"+total);
		
		
	}
	public void average(int noOfSubjects){
		avg=total/noOfSubjects;
		System.out.println("your average is "+avg);
		
		
	}
	public  void grade(){
	if(avg<50){
		System.out.println("your grade is U");
	}
	else if(avg>=50&&avg<60){
		System.out.println("your grade is D");
	}
	else if(avg>=60&&avg<70){
		System.out.println("your grade is C");
	}
	else if(avg>=70&&avg<80){
		System.out.println("your grade is B");
	}
	else if(avg>=80&&avg<90){
		System.out.println("your grade is A");
	}
	else
	{
		System.out.println("your grade is A+");
	}
		
	}
	}

