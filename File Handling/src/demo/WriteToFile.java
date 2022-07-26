package demo;

import java.io.*;

public class WriteToFile {

	public static void main(String[] args) {
		try {  
	        FileWriter fwrite = new FileWriter("//home//samcouser//Dileepkumar//File Handling//Demo.txt");  
	        
	        
	        fwrite.write("A named location used to store related information is referred to as a File.");   
	        fwrite.append("Dileep");
	        fwrite.close();   
	        System.out.println("Content is successfully wrote to the file.");  
	    } catch (IOException e) {  
	        System.out.println("Unexpected error occurred");  
	        e.printStackTrace();  
	        }  
	  }  
}  
