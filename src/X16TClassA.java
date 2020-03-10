import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class X16TClassA {
public static void main(String[] args) throws Exception {
	InputStreamReader inputStreamReader=new InputStreamReader(System.in);
	BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
	System.out.println("enter the number of students");
	int noOfStudents=Integer.parseInt(bufferedReader.readLine());
	System.out.println("enter the number of subjects");
	int noOfSubjects=Integer.parseInt(bufferedReader.readLine());
	X16TClassB objArray[]=new X16TClassB[noOfStudents];
	int marks[]=new int[noOfSubjects];
	for(int j=0;j<noOfStudents;j++){
	for(int i=0;i<noOfSubjects;i++){
		System.out.println("enter the mark"+(i+1));
		marks[i]=Integer.parseInt(bufferedReader.readLine());
		
	}
	X16TClassB classBObj=new X16TClassB(marks); 
	objArray[j]=classBObj;
	}
	for(int k=0;k<noOfStudents;k++){
		System.out.println("total of student"+objArray[k].total);
	}

}

}
