package demo;

import java.io.*;

public class ByteStream {

	public static void main(String[] args) throws IOException{
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("//home//samcouser//Dileepkumar//File Handling//Demo.odt");
			out = new FileOutputStream("//home//samcouser//Dileepkumar//File Handling//outDemo.odt");
			int c;
			
			while((c = in.read()) != 1) {
				out.write((char)c);
			}
		}
		finally {
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();
			}
		}
	}
}
