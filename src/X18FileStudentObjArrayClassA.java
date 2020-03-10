import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class X18FileStudentObjArrayClassA {
	InputStreamReader inputStreamReader=new InputStreamReader(System.in);
	BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
	int noOfStudents;
	int noOfSubjects;
	int mark[];
	int total;
	int avg;
	public void marks()throws Exception{
		mark=new int[noOfSubjects];
		for(int j=0;j<noOfSubjects;j++){
			System.out.println("enter the mark"+(j+1));
			mark[j]=Integer.parseInt(bufferedReader.readLine());
		}
		
		
	}
	public void total(){
		total=0;
		for(int k=0;k<noOfSubjects;k++){
			total=total+mark[k];
		}
	}
	public void avg(){
		avg=total/noOfSubjects;
	}
	public void fileWriter()throws Exception{
		System.out.println("enter the number of students");
		noOfStudents=Integer.parseInt(bufferedReader.readLine());
		System.out.println("enter the number of subjects");
		noOfSubjects=Integer.parseInt(bufferedReader.readLine());
		X18FileStudentObjArrayClassB objFileBArray[]=new X18FileStudentObjArrayClassB[noOfStudents];
		for(int i=0;i<noOfStudents;i++){
			System.out.println("enter the name of student"+(i+1));
			String name=bufferedReader.readLine();
			System.out.println("enter the roll no of student"+(i+1));
			long rollno=Integer.parseInt(bufferedReader.readLine());
			marks();
			total();
			avg();
			X18FileStudentObjArrayClassB objFileB=new X18FileStudentObjArrayClassB(name,rollno,mark,total,avg);
			objFileBArray[i]=objFileB;
			
		}
		for(int m=0;m<noOfStudents;m++){
			File file=new File(objFileBArray[m].rolln+".txt");
			FileWriter fw=new FileWriter(file);
			fw.write(objFileBArray[m].nam);
			fw.write("\n");
			fw.write(objFileBArray[m].rolln+"");
			for(int n=0;n<noOfSubjects;n++){
			fw.write(objFileBArray[m].mar[n]+"");
			}
			fw.write(objFileBArray[m].tot+"");
			fw.write(objFileBArray[m].av+"");
			fw.flush();
			fw.close();
		}
		
	}
	public void fileReader()throws Exception{
		System.out.println("enter the roll number to read from file ");
		long fileNo=Long.parseLong(bufferedReader.readLine());
		File file=new File(fileNo+".txt");
		FileReader fr=new FileReader(file);
		int reader;
		String readed="";
		while((reader=fr.read())>0){
		readed=readed+(char) reader;
			
		}
		System.out.println(readed);
		
	}

	public static void main(String[] args) throws Exception {
		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		System.out.println("Enter 1 for file writer ");
		System.out.println("Enter 2 for file reader");
		int value=Integer.parseInt(bufferedReader.readLine());
		X18FileStudentObjArrayClassA objFileA=new X18FileStudentObjArrayClassA();
		switch(value)
		{
		case 1:
			objFileA.fileWriter();
			break;
		case 2:
			objFileA.fileReader();
			break;
		default:
			System.out.println("entered number is wrong");
		break;
		}
		

}
}
