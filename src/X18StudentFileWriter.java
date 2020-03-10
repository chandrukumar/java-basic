import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class X18StudentFileWriter {
	InputStreamReader inputStreamReader=new InputStreamReader(System.in);
	BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
	int mark[];
	int total;
	public int[] marks(int noOfSubjects) throws Exception{
		mark=new int[noOfSubjects];
		for(int j=0;j<noOfSubjects;j++){
			System.out.println("enter the mark"+(j+1));
			mark[j]=Integer.parseInt(bufferedReader.readLine());
		}
		return mark;
		
	}
	public int total(int noOfSubjects){
		total=0;
		for(int k=0;k<noOfSubjects;k++){
			total=total+mark[k];
			
		}
		return total;
	}
	public int avg(int noOfSubjects){
		int avg=total/noOfSubjects;
		return avg;
	}

	public static void main(String[] args) throws Exception {
		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		System.out.println("enter the number of students");
		int noOfStudents=Integer.parseInt(bufferedReader.readLine());
		System.out.println("enter the number of subjects");
		int noOfSubjects=Integer.parseInt(bufferedReader.readLine());
		X18StudentFileWriter objFileWrite=new X18StudentFileWriter();
		for(int i=0;i<noOfStudents;i++){
			System.out.println("enter the name of sudent"+(i+1));
			String name=bufferedReader.readLine();
			System.out.println("enter the roll no of sudent"+(i+1));
			String rollno=bufferedReader.readLine();
			int[] marks=objFileWrite.marks(noOfSubjects);
			int tot=objFileWrite.total(noOfSubjects);
			int av=objFileWrite.avg(noOfSubjects);
			File file=new File(rollno+".txt");
			FileWriter fop= new FileWriter(file);
			fop.write("name is"+name);

			fop.write("roll no is "+rollno);
			for(int l=0;l<noOfSubjects;l++)
			{
			fop.write("mark"+(l+1)+" of"+marks[l]+"");
			}
			fop.write("total is"+tot+"");
			fop.write("average is"+av+"");
			fop.flush();
			fop.close();
		
	}


	
}
}