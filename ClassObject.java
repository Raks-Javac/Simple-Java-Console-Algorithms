import java.util.Scanner;

public class classObject {
    public static void main(String[] args){
 
            Apartment room1 = new  Apartment();
			
  room1.calculateApartment();




       }
}
  
  
   class Apartment{ 
  
     private double height;
	 private double weight;
  
        public void Apartment(){
	         height =0;
			 weight = 0;
	 
         }
		 
		 public void  Apartment(double innerHeight,double innerWeight){
			 this.height = innerHeight;
			 this.weight = innerWeight;
		 } 
		 
		 
		public double calculateApartment(){
		
        Scanner objScan = new Scanner(System.in);
    System.out.println("input your height");
	
	
	 double height = objScan.nextDouble();
	 System.out.println("input your weight");
        
double weight = objScan.nextDouble();
		  return height*weight;
		
		}			
		 
		 
		 
		 
		 
		 
		 
		 
  }