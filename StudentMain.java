import java.io.*;
abstract class Student
{
	public int RollNumber;	
	String Name;
	public long RegistrationNumber;

}
class Student1stYear extends Student
{
	int M1,M2,M3,M4,M5;
	int Total;
	float Percent;
	public void GetStudentInfo() throws Exception
	{
		String str;
		
		try
		{ 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter RollNumber:");		
		str=br.readLine();
		RollNumber=Integer.parseInt(str);
		System.out.println("Enter Name:");
		Name=br.readLine();
		System.out.println("Enter Registration No.:");
		str=br.readLine();
		RegistrationNumber=Long.parseLong(str);
		System.out.println("Enter Marks in first subject:");
		str=br.readLine();
		M1=Integer.parseInt(str);
		System.out.println("Enter Marks in Second subject:");
		str=br.readLine();
		M2=Integer.parseInt(str);
		System.out.println("Enter Marks in Third subject:");
		str=br.readLine();
		M3=Integer.parseInt(str);
		
		System.out.println("Enter Marks in fourth subject:");
		str=br.readLine();
		M4=Integer.parseInt(str);
		System.out.println("Enter Marks in fifth subject:");
		str=br.readLine();
		M5=Integer.parseInt(str);
		Total=M1+M2+M3+M4+M5;
		Percent=(float)Total/5;
		}
		catch (IOException e)
		{	e.printStackTrace();
		}			

	}
	public void Display()
	{
		System.out.println("Roll Number is :"+RollNumber);
		System.out.println("Name:"+Name);
		System.out.println("Registration Number:"+RegistrationNumber);
		System.out.println("Marks in Subject1:"+M1);
		System.out.println("Marks in Subject2:"+M2);
		System.out.println("Marks in Subject3:"+M3);
		System.out.println("Marks in Subject4:"+M4);
		System.out.println("Marks in Subject5:"+M5);
		System.out.println("Total Marks:"+Total);
		System.out.println("Percentage:"+Percent);
	}
}
class Student2ndYear extends Student
{
	int M1,M2,M3,M4,M5;
	int Total;
	float Percent;
	public void GetStudentInfo() throws Exception
	{
		String str;
		
		try
		{ 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter RollNumber:");		
		str=br.readLine();
		RollNumber=Integer.parseInt(str);
		System.out.println("Enter Name:");
		Name=br.readLine();
		System.out.println("Enter Registration No.:");
		str=br.readLine();
		RegistrationNumber=Long.parseLong(str);
		System.out.println("Enter Marks in first subject:");
		str=br.readLine();
		M1=Integer.parseInt(str);
		System.out.println("Enter Marks in Second subject:");
		str=br.readLine();
		M2=Integer.parseInt(str);
		System.out.println("Enter Marks in Third subject:");
		str=br.readLine();
		M3=Integer.parseInt(str);
		
		System.out.println("Enter Marks in fourth subject:");
		str=br.readLine();
		M4=Integer.parseInt(str);
		System.out.println("Enter Marks in fifth subject:");
		str=br.readLine();
		M5=Integer.parseInt(str);
		Total=M1+M2+M3+M4+M5;
		Percent=(float)Total/5;
		}
		catch (IOException e)
		{	e.printStackTrace();
		}			

	}
	public void Display()
	{
		System.out.println("Roll Number is :"+RollNumber);
		System.out.println("Name:"+Name);
		System.out.println("Registration Number:"+RegistrationNumber);
		System.out.println("Marks in Subject1:"+M1);
		System.out.println("Marks in Subject2:"+M2);
		System.out.println("Marks in Subject3:"+M3);
		System.out.println("Marks in Subject4:"+M4);
		System.out.println("Marks in Subject5:"+M5);
		System.out.println("Total Marks:"+Total);
		System.out.println("Percentage:"+Percent);
	}
}

class Student3rdYear extends Student
{
	int M1,M2,M3,M4,M5;
	int Total;
	float Percent;
	public void GetStudentInfo() throws Exception
	{
		String str;
		
		try
		{ 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter RollNumber:");		
		str=br.readLine();
		RollNumber=Integer.parseInt(str);
		System.out.println("Enter Name:");
		Name=br.readLine();
		System.out.println("Enter Registration No.:");
		str=br.readLine();
		RegistrationNumber=Long.parseLong(str);
		System.out.println("Enter Marks in first subject:");
		str=br.readLine();
		M1=Integer.parseInt(str);
		System.out.println("Enter Marks in Second subject:");
		str=br.readLine();
		M2=Integer.parseInt(str);
		System.out.println("Enter Marks in Third subject:");
		str=br.readLine();
		M3=Integer.parseInt(str);
		
		System.out.println("Enter Marks in fourth subject:");
		str=br.readLine();
		M4=Integer.parseInt(str);
		System.out.println("Enter Marks in fifth subject:");
		str=br.readLine();
		M5=Integer.parseInt(str);
		Total=M1+M2+M3+M4+M5;
		Percent=(float)Total/5;
		}
		catch (IOException e)
		{	e.printStackTrace();
		}			

	}
	public void Display()
	{
		System.out.println("Roll Number is :"+RollNumber);
		System.out.println("Name:"+Name);
		System.out.println("Registration Number:"+RegistrationNumber);
		System.out.println("Marks in Subject1:"+M1);
		System.out.println("Marks in Subject2:"+M2);
		System.out.println("Marks in Subject3:"+M3);
		System.out.println("Marks in Subject4:"+M4);
		System.out.println("Marks in Subject5:"+M5);
		System.out.println("Total Marks:"+Total);
		System.out.println("Percentage:"+Percent);
	}
}

public class StudentMain
{
	public static void main (String args[]) throws Exception
	{	try
		{
		Student1stYear S1=new Student1stYear();
		Student2ndYear S2=new Student2ndYear();
		Student3rdYear S3=new Student3rdYear();
		S1.GetStudentInfo();
		S1.Display();	
		S2.GetStudentInfo();
		S2.Display();	
		S3.GetStudentInfo();
		S3.Display();	
		}
		catch(Exception e)
		{	e.printStackTrace();
		}			
		
	}
}
