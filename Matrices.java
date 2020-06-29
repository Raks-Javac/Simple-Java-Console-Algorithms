public class Matrices {
   public static void main(String []args) {
        
		  int Mat2[][]={{7,4,5},{9,3,6},{2,8,1}};
		  int second[][]={{9,5,4,4,5},{6,5,4,4,3,3}};
		 System.out.println("\t"+"This is my first matrice"); 
		display(Mat2);
        System.out.println("\t"+"This is my second matrice"); 
        display(second);
		
		
   }
		public static void display(int x[][]){  
		   for(int row=0;row<x.length;row++)
		  {
		  for(int columns=0;columns<x[row].length;columns++)
		  {
		  System.out.print(x[row][columns]+"\t");
		  }
		  System.out.println();
       }
   }
}