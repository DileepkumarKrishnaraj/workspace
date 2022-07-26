package demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DataSource1 {

	public static void main(String[] args) {
		 Properties props = new Properties();
		    InputStream input = null;

		    try {

		        input = new FileInputStream("src/demo/MyDataSource.properties");
		        props.load(input);
		        
		        System.out.println(props.getProperty("USERNAME"));
		        System.out.println(props.getProperty("PASSWORD"));

		    } catch (IOException e) {
		        e.printStackTrace();
		    } finally {
		        if (input != null) {
		            try {
		                input.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		    }
	}

}
