package com.xworkz.textcreating;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
public class FileReadWrite {
	public static void main(String[] args) throws IOException
	{
		FileWriter filewriter=new FileWriter("C:\\Users\\Lenovo\\Desktop\\.txt");
		filewriter.write("hello xworkz");
		filewriter.close();
		FileReader filereader=new FileReader("C:\\Users\\Lenovo\\Desktop\\.txt");
		char[] ref=new char[50];
		filereader.read(ref);
		System.out.println(ref);
		filereader.close();
	}

}
