
public class AddM {
  public static void main(String[] args) {
	  java.util.Scanner in = new java.util.Scanner(System.in);
	  System.out.println("Enter Matrices");
	


int FirstM[][] = new int[i][j];
     int   SecondM[][] = new int[i][j];
      int  sum[][] = new int[i][j]; 
	


    System.out.println("\t"+"This is the sum of my matrices");
           AddM ng=new AddM();
		   ng.Add();
		System.out.println("\t"+"This is the subtraction of my matrice");
		   AddM minus=new AddM();
		    minus.Sub();
        System.out.println("\t"+"This is my multiplication for the matrices");
			AddM mt= new AddM();
			mt.Multi();
      }
	       public void Add(){
			   System.out.println("Enter number of rows");
			   int i=in.nextInt();
			   Syste.out.println("Enter number of columns");
			   int j=in.nextInt();
			 
		  int sum[][]= new int[i][j];
		  
		  for(int row=0;row<i;++row)
		  {
		  for(int columns=0;columns<j;++columns)
		  { 
		  sum[row][columns]=FirstM[row][columns]+SecondM[row][columns];  
		  }
		  }
		  
		  
		 for(int[] Roll :sum){
            for(int column : Roll) {
                System.out.print(column+ "\t");
			}
		 
            System.out.println();
		    }
			
		   }
             
			 
			 public void Sub() {
				 System.out.println("Enter number of rows");
			   int i=in.nextInt();
			   Syste.out.println("Enter number of columns");
			   int j=in.nextInt();
			 int Sb[][]= new int[i][j];
		 
		   for(int row=0;row<i;++row)
		  {
		  for(int columns=0;columns<j;++columns)
		  { 
		  Sb[row][columns]=FirstM[row][columns]-SecondM[row][columns];
		   }
		  }
		  
		  
		 for(int[] Roll :Sb){
            for(int column : Roll) {
                System.out.print(column+ "\t");
			}
		 
            System.out.println();
		     }	
		}


          public void Multi() {
            System.out.println("Enter number of rows");
			   int i=in.nextInt();
			   System.out.println("Enter number of columns");
			   int j=in.nextInt();
			 int Mt[][]= new int[i][j];
		 
		   for(int row=0;row<i;++row)
		  {
		  for(int columns=0;columns<j;++columns)
		  { 
		  Mt[row][columns]=FirstM[columns][row]*SecondM[row][row];//Always remember multiplication in matrices 
		   }
		  }
		  
		  
		 for(int[] Roll :Mt){
            for(int column : Roll) {
                System.out.print(column+ "\t");
			}
		 
            System.out.println();
		    }
			 
   }
   		  
   
}
	   
	   
	   
	   
	   

