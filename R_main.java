import java.util.Scanner;

public class R_main {
   public static void main(String []args) {  
    
          Scanner age= new Scanner(System.in);
      
      String age;
      System.out.println("Enter age");
      age = None.next();
 
 switch(age)
  {
    case 1: 
     System.out.println("boot");
     age= new Scanner(System.in);
     break;
    case 2: 
     System.out.println("shutdown");
     age= new Scanner(System.in);
     break;
    case 3:
     System.out.println("Restart");
     age= new Scanner(System.in);
     break;
    default: 
     System.out.println("select task");
     age= new Scanner(System.in);
  }
 }
}