import java.util.Scanner;

public class LoopsPart1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Shape? ");
		String shape = sc.next();

		
		//YOUR CODE STARTS HERE
	
	    	  		if (shape.equals("square")){       

	                     System.out.print("Size? ");
	                     int size = sc.nextInt();
	               
	                       for (int i=1; i <=size ; i++) {
	                    	   
	                    	       for (int l=0; l<size ; l++) {
	                    	    	   
	                    	    	   System.out.print("*");
	                    	       }
	                    	   System.out.println("");
	                       }
	                       
	    	  		}
	    	  		
	    	  		else if (shape.equals("rectangle")) {
	    	  			 
	    	  			System.out.print("Width? ");
	    	  			int width = sc.nextInt();			
	    	  		  

	    	  		    System.out.print("Height? ");
	    	  			int height = sc.nextInt();
	    	  			
	    	  				for (int i = 0; i < height ; i ++) {
	    	  					
	    	  					for (int j = 0; j < width ; j ++) {
		    	  					System.out.print("*");
	    	  					}
	    	  					System.out.println("");
	    	  				}
	    	  				 
	    	  		}
	    	  		
	    	  		else if (shape.equals("triangle")) {
	    	  			
	    	  			System.out.print("Size? ");
	    	  			int size = sc.nextInt();
	    	  			
	    	  			
	    	  			   for (int i = 1 ; i <= size; i++) {
	    	  				   
	    	  				   for (int y =1; y <= size; y++)
	    	  				     
	    	  					   
	    	  					   if (y<=i) {
	    	  					   System.out.print("*");
	    	  				      }
	    	  				   System.out.println("");
	    	  				
	    	  				     }
	    	  			  
	    	  			
	    	  		}
	    	  		else {
	    	  			
	    	  		}
	        	
		
		//YOUR CODE ENDS HERE

		sc.close();
	}

}
