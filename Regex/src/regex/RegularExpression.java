package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression{
	 public static void main(String args[]){    
		Pattern p = Pattern.compile(".s");  
		Matcher m = p.matcher("as");  
		boolean b = m.matches(); 
		System.out.println(b);
	}
}