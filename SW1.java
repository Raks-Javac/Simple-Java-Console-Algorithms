
public class SW1 {
	    
   public static void main(String []args) {  
      
	  char ch;
	    java.util.Scanner reader = new java.util.Scanner(System.in);
		System.out.println("Enter a digit");
		
		int number = reader.nextInt(); 
	
while(number) {
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
	 default:System.out.println("wait");
	  System.out.println("enter yes to repeat and no to end");
		  String choice= reader.next();
		  System.out.println("processing....");
	  }	
    }	  
  } 
}  