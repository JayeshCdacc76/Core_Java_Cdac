package Exception;

public class Throw
{
	  public static void validate(int age) 
	  {  
	        if(age<18) 
	        {  
	            throw new ArithmeticException("Person is not eligible to vote");    
	        }  
	        else 
	        {  
	            System.out.println("Person is eligible to vote!!");  
	        }  
	    }  
	
      
	public static void main(String[] args)
	{
		try 
		  {
	            validate(23);
	            validate(15);
	      } 
		  catch (ArithmeticException e) 
		  {
	            System.out.println(e.getMessage());
	      }

	}

}
