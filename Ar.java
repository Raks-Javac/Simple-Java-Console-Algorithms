public class Ar{
   public static void main(String[] args){
         int b=45;
         int c=68;	     
         int d=58;

            java.util.Scanner sc = new java.util.Scanner(System.in);  
              int pick = sc.nextInt();
int i =3;
int j=3;
int[][] Mt = new int[i][j];
  Prnt(Mt,i,j);

        }  
   } 

 public static void Prnt(int[][] Mt,int i,int j)  {


	System.out.println("your first array is ;");
	for(int row=0;row < i;++row)
		  {
		  for(int columns=0;columns < j ;++columns)
		  { 
	        System.out.print(Mt[row][columns] +"\t");
		  }
		  System.out.println();
}

		  }		  
  
}