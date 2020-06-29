import java.util.*;
 public  class CountS {
	 static char choice;
 public static void main(String []args){
	
        Scanner sc = new Scanner(System.in);
		
    do{
		System.out.println("Enter your Sentence");
	    String words =sc.nextLine();
        String[] split = words.split("[]+");
         int len =split.length;
        if(words.startsWith("")){
		len-= 1;
		}
               System.out.println(len);
               System.out.println("Do you want to enter another sentence ?");
                     choice = sc.next().charAt(0);
          System.out.println("Thank you");					 
       }while(choice!='n');
  }
 }