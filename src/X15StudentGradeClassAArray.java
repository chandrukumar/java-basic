import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class X15StudentGradeClassAArray {
public static void main(String[] args) throws Exception {
	X15StudentGradeClassBArray studentGrade=new X15StudentGradeClassBArray();//object creation
	InputStreamReader inputStreamReader=new InputStreamReader(System.in);
	BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
	int noOfStudents;
	int noOfSubjects;
    System.out.println("Enter the number of students to calculate total and grade");
    noOfStudents=Integer.parseInt(bufferedReader.readLine());
    if(noOfStudents>0){
	System.out.println("Enter the number of subjects");
	noOfSubjects=Integer.parseInt(bufferedReader.readLine());
	if(noOfSubjects>0){
	for(int i=1;i<=noOfStudents;i++)
	{
		studentGrade.marks(noOfSubjects,i);
		studentGrade.total(i);
		studentGrade.average(noOfSubjects);
		studentGrade.grade();
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
