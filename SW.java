
import java.util.Scanner;

public class SW {
   public static void main(String []args) {  
    
	    Scanner reader = new Scanner(System.in);
		System.out.println("Enter a digit");
		
		int number = reader.nextInt();
 
 switch(number)
   {
    case 50: 
     System.out.println("boot");
     break;
    case 60: 
     System.out.println("shutdown");
     break;
    case 70:
     System.out.println("Restart");
     break;
    default: System.out.println("select task");
    }
	System.out.println("u can only continue if u are 18 and above type age to continue operation");
	
	int age = reader.nextInt();
    
	 if(age>=18){
		switch(number)
         {
           case 50: 
           System.out.println("boot");
           break;
           case 60: 
           System.out.println("shutdown");
           break;
           case 70:
           System.out.println("Restart");
           break;
           default: System.out.println("select task");
         }
	}else{
		System.out.println("The operation cant be repeated");
	     }		 		
  }
 }