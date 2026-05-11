// import files here as needed
 
 import java.text.DecimalFormat;	// needed for formatting output numbers
 import java.util.Scanner; //for input

 
 public class Main
 {  // begin class
 public static void main(String[] args)     
    {//begin main



 	// ********** declare constants **********
 	
 	
 	// *********** declare variables **********
 	int grade=0;
	double sum=0;
	double average=0;
	int count=0;


	// ********* code needed for keyboard input ******
   	Scanner in = new Scanner(System.in);  //creates a Scanner object in

   	//sample code for loop priming
	System.out.print("Enter a number (0 to stop): ");
  	grade = in.nextInt();
  while (grade!=0){
	count++;
	sum = sum+grade;
	System.out.println("Enter a number (o to stop): ");
	grade = in.nextInt();
  }
  average =sum/count;
  System.out.println(average + " Is the average.");
	//add loop here



	
 	 									
 	// ********** closing message **********
 	
 	System.out.println("end of processing");
 	
 	}  // end main
 
 }  // end class

