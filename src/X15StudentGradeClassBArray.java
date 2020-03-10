import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class X15StudentGradeClassBArray {
	 int total;
	 int avg;
	 int mark[];
	 InputStreamReader inputStreamReader= new InputStreamReader(System.in);
     BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
	public  void marks(int noOfSubjects,int i) throws Exception{
		mark=new int[noOfSubjects];
		for(int j=0;j<noOfSubjects;j++)
		{
			System.out.println("enter the mark of subject for student"+i);
		mark[j] = Integer.parseInt(bufferedReader.readLine());
	
		
		}
		for(int j=0;j<noOfSubjects;j++){
			System.out.println("mark of subject"+j+"is"+mark[j]);
		}
		
		
	}
	public void total(int i){
		total=0;
		for(int k=0;k<mark.length;k++){
			total=total+mark[k];
			
		}
		System.out.println("total of student"+i+"is"+total);
			
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


