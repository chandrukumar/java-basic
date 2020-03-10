import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class X10StudentGrade {
	static int noOfStudents;
	static int noOfSubjects;
	static int total;
	static int avg;
	static InputStreamReader inputStreamReader= new InputStreamReader(System.in);
    static BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
	public static void total() throws Exception{
	total=0;
		for(int j=1;j<=noOfSubjects;j++)
		{
			System.out.println("enter the mark of subject"+j+"for student"+noOfStudents);
		int mark = Integer.parseInt(bufferedReader.readLine());
		total=total+mark;
		}
		System.out.println("your total of student"+noOfStudents+"is"+total);
		
		
	}
	public static void average(){
		avg=total/noOfSubjects;
		System.out.println("your average is "+avg);
		
		
	}
	public static void grade(){
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
	public static void main(String[] args) throws Exception {
    System.out.println("Enter the number of students to calculate total and grade");
    noOfStudents=Integer.parseInt(bufferedReader.readLine());
    if(noOfStudents>0){
	System.out.println("Enter the number of subjects");
	noOfSubjects=Integer.parseInt(bufferedReader.readLine());
	if(noOfSubjects>0){
	for(int i=1;i<=noOfStudents;i++)
	{
		total();
		average();
		grade();
	}
	}
	else
	{
		System.out.println("number of sujects should be more than zero");
	}
    }
    else
    {
    	System.out.println("number of students should not be zero");
    }
	
	}
	}

