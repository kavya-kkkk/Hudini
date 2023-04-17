package utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readconfig {
	
	Properties pro;

	public readconfig() {
		
		File src=new File("./configuration/config.properties");
	    try {
			FileInputStream file=new FileInputStream(src);
			pro=new Properties();
			pro.load(file);
		    }
	     catch(Exception e){
			
			System.out.println("exception is"+e.getMessage());
			
			
		}
	    
	}
   public String getappurl() //we need to ADD METHOD FOR ALLVARIBALES FROM THE CONFIG.PRO
   {
	String url=pro.getProperty("baseurl");
	return url;
    }
	
   public String getemail()
   {
	String email=pro.getProperty("email");
	return email;
   }
	

   public String getpassword()
  {
	String password=pro.getProperty("password");
	return password;
    }
	

			}

	
	


