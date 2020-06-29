import java.util./*Time*/;


public class Watch {

   public static void main(String  []args){
   
   //implementing my StopWatch class methods 
   StopWatch inputTime = new StopWatch();
   inputTime.setstartTime(52.6);
   inputTime.setendTime(98.34);
   
   inputTime.start();
   inputTime.stop();
   
   
   
   }


     class StopWatch{
	 
	 
	//initializing fields 
	 private double startTime;
	 private double endTime;
	 
	 
	 //setting and getting the encapsulation
	    public double getstartTime(){
			return  startTime;
	}
	   public void setstartTime(double startTime){
		   this.startTime = startTime;
	   }
	   

         	    public double getendTime(){
			return  endTime;
	}
	   public void setendTime(double startTime){
		   this.endTime = startTime;
	   }
	   
//a default constructor and a  no args constructor that sets startTime to current time 
/* public void StopWatch(){
		     startTime = 0;
			 endTime = 0;
			 
	 }
	  public void StopWatch(double currentTime){
		
         setstartTime(currentTime);		
		  
	  }

      // initializing start() and stop() methods that sets startTime and endTime to current Time 

    public void start(){
		
		startTime = currentTime;
		
		
	}

    
	 
    public void stop(){
		
		endTime = currentTime;//replace the currentTime with the java inbuilt time method 
		
		
	}



      public double getElapsedTime(){
		  
		  return 
	  }

*/
         

 


}
