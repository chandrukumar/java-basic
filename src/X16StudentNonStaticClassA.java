import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class X16StudentNonStaticClassA {
	InputStreamReader inputStreamReader=new InputStreamReader(System.in);
	BufferedReader bufferedReader =new BufferedReader(inputStreamReader);
	int mark[];
    int total;
    int noOfSubject;
	public int[] marks(int noOfStudents,int noOfSubjects,int i) throws Exception{
		noOfSubject=noOfSubjects;
		mark=new int[noOfSubjects];
		for(int j=0;j<noOfSubjects;j++){
			System.out.println("enter the mark of subject"+(j+1+"for student"+(i+1)));
			mark[j]=Integer.parseInt(bufferedReader.readLine());
	
		}
		return mark;
		
	}
	public  int total(){
		total=0;
		for(int k=0;k<noOfSubject;k++){
			total=total+mark[k];
			
		}
		return total;
	}
	public int avg(){
		int avg=total/noOfSubject;
		return avg;
	}
	
	public static void main(String[] args) throws Exception {
		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		
		
		
		System.out.println("enter the number of students");
	    int noOfStudents=Integer.parseInt(bufferedReader.readLine());
	    System.out.println("enter the number of subjects");
	    int noOfSubjects=Integer.parseInt(bufferedReader.readLine());
	    X16StudentNonStaticClassA objStaticClassA= new X16StudentNonStaticClassA();
		X16StudentNonStaticClassB objNonStaticClassBArray[]=new X16StudentNonStaticClassB[noOfStudents];
	    for(int i=0;i<noOfStudents;i++){
	    	System.out.println("enter the name of student "+(i+1));
	    	String name =bufferedReader.readLine();
	    	System.out.println("enter the age of student "+(i+1));
	    	int age=Integer.parseInt(bufferedReader.readLine());
	    	System.out.println("enter the gender of student "+(i+1));
	    	char gender=bufferedReader.readLine().charAt(0);
	    	System.out.println("enter the roll no of student "+(i+1));
	    	long rollno=Integer.parseInt(bufferedReader.readLine());
	    	int[] mark=objStaticClassA.marks(noOfStudents,noOfSubjects,i );
	    	int total=objStaticClassA.total();
	    	int avg=objStaticClassA.avg();
	    	X16StudentNonStaticClassB objNonStaticClassB=new X16StudentNonStaticClassB(name,age,gender,rollno,mark,total,avg);
	    	objNonStaticClassBArray[i]=objNonStaticClassB;
	   }
	    for( int i=0;i<noOfStudents;i++){
	    	System.out.println("name of student"+(i+1)+"is"+objNonStaticClassBArray[i].nam);
	    	System.out.println("age of student"+(i+1)+"is"+objNonStaticClassBArray[i].ag);
	    	System.out.println("gender of student"+(i+1)+"is"+objNonStaticClassBArray[i].gende);
	    	System.out.println("roll no of student"+(i+1)+"is"+objNonStaticClassBArray[i].rolln);
	    	for(int k=0;k<objNonStaticClassBArray[i].mark.length;k++){
	    		System.out.println("mark of subject"+(k+1)+"is"+objNonStaticClassBArray[i].mark[k]);
	    	}
	    	System.out.println("total of student"+(i+1)+"is"+objNonStaticClassBArray[i].tota);
	    	System.out.println("average  of student"+(i+1)+"is"+objNonStaticClassBArray[i].av);
	    }
	    
	    
	}
	
	

}
