package task1exception;

import java.util.Scanner;

public class Raisingexe
{ 
	
	
	
	
	
    public static void validatewithdraw(int money)throws InvalidException
    {  
    int balance=500;
    if(money > 500)  
     throw new InvalidException("insuffficient money");
    else 
     System.out.println("valied money");  
    }
    
    
    
    
   public static void main(String args[])
   {  
	   Scanner sc=new Scanner(System.in);
	   int x=sc.nextInt();  
     try
     {  
     validatewithdraw(x);  
     }
     catch(Exception m)
     {
   	 System.out.println("Exception occured: "+m);
   	 System.out.println("errorcode"+"    "+75875646);
     }    
 }  
   
class InvalidException extends Exception
{  
InvalidException(String s)
{  
 super(s);  
}  
System.out.println("this is branch2");
}
}
