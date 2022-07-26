package studentmark;

import java.util.*;

public class Mark  {    
	int studentMark;    
	String studentName,subject;      
	public Mark(int studentMark, String studentName, String subject) {    
		this.studentMark = studentMark;    
	    this.studentName = studentName;    
	    this.subject = subject;    
		}    

	public static void main(String[] args) {
		Map<Integer, Mark> map = new HashMap<Integer, Mark>();
		Mark s1 = new Mark(87,"Dileep","Mathematics I");
		Mark s2 = new Mark(98,"Adhavan","Digital Communication");
		Mark s3 = new Mark(89,"GT","VLSI Design");
		
		map.put(1,s1);  
		map.put(2,s2);  
		map.put(3,s3); 
		
		for(Map.Entry<Integer, Mark> entry:map.entrySet()){    
		    Integer key=entry.getKey();  
		    Mark s=entry.getValue();  
		    System.out.println(key+" Student Details:");  
		    System.out.println(s.subject+" "+s.studentMark+" ");   

	}
	}
}
