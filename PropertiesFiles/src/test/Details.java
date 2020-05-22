package test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Details 
{

	public static void main(String[] args) 
	{
FileWriter fw=null;
Properties prop=new Properties();

try 
{
	fw=new FileWriter("E:\\J2EE\\data\\employee.properties");
	
	prop.setProperty("employeeName","Sachin");
	prop.setProperty("employeeAge","26");
	
	prop.store(fw, "EXTERNAL FILE");
	
	System.out.println("PROPERTIES FILE CREATED");
	
	
} 
catch (IOException e)
{
	e.printStackTrace();
}
 finally
 {
 if(fw!=null)
 {
	 try 
	 {
		fw.close();
	} 
	 catch (IOException e)
	 {
		e.printStackTrace();
	}
  }
 }
}
}


