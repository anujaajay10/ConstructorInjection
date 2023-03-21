package ustbatchno3.Constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.lang.String;

public class App 
{
    public static void main( String[] args )                                                             
    {                                                                                                      
    	ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");                
    	Roles r=context.getBean("sharath",Roles.class );                                                    
    	r.display();                                                                                      
    	                                                                                                   
    }                                                                                                      
    
}
