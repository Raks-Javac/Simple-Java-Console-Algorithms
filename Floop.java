import java.util.*;

public class Floop {
	 public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);
		 System.out.println("Enter any number to check if even or odd");
		 int number = obj.nextInt();	
		 int p = number%2;
	if(p==0) { 
        System.out.println("the number is an even number");	   
	 }else if(p!=0) {
	 System.out.println("the number is an odd number"); }      
     }  	 
}  