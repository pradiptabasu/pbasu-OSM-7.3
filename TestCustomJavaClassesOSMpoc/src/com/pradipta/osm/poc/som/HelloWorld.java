package com.pradipta.osm.poc.som;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWorld 
{
	public void greetings()
	{
		System.out.println("Hello Custom Java call from XSLT !!!");
		try 
		{
			File file = new File("D:/test1.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("This is ");
			fileWriter.write("a test");
			fileWriter.flush();
			fileWriter.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
