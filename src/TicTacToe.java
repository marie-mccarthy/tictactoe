import java.util.Scanner;

public class Main
{
	public static final int oval=2;
	public static final int fill=1; 
	public static final int open=0; 
	
	public static final int row=3, col=3; 
	public static int [][] Displaydisplayboard = new int [row][col];
	
	public static int game; 
	public static int gamer; 
	public static int prow, pcol; 
	
	public static int winGame; 
	
	
	public static Scanner in = new Scanner (System.in); 
	
	public static void main (String[]args) {
		
	}
	public static void Displaydisplayboard() {
		 for (int row1 = 0; row1 < row; row1++) {
	         for (int col1 = 0; col1 < col; col1++) {
	            fillBox(Displaydisplayboard[row1][col1]); 
	            if (col1!= col - 1) {
	               System.out.print("+");   
	            }
	         }
	         System.out.println();
	         if (row1!= row - 1) {
	            System.out.println("________"); 
	         }
	      }
	      System.out.println();
	   }
	 public static void myResult() 
	  {
	   public static int winGame; 

	     if(displaydisplayboard[row][0] == diplaydisplayboard[row][1] && displayboard[row][1] == displayboard[row][2] && (displayboard[row][0] == 'X' || displayboard[row][0] == 'O'))
	      System.out.println( + winGame + " wins.");

	    else if(displayboard[0][col] == displayboard[1][col] && displayboard[1][col] == displayboard[2][col] && (displayboard[0][col] == 'X' || displayboard[0][col] == 'O'))
	      System.out.println( + winGame + " wins.");

	    else if(displayboard[0][0] == displayboard[1][1] && displayboard[1][1] == displayboard[2][2] && (displayboard[0][0] == 'X' || displayboard [0][0] == 'O'))
	      System.out.println( + winGame + " wins.");

	    else if(displayboard[2][0] == displayboard [1][1] && displayboard[1][1] == displayboard[0][2] && (displayboard [2][0] == 'X' || displayboard[2][0] == 'O'))
	      System.out.println( + winGame + " wins.");

	    else if(moveCount == 9)
	     System.out.println("Catscratch.");

	}
	public static void fillBox(int entry) {
	    switch (entry) {
	       case open:  
	    	   System.out.print(" "); 
	    	   break;
	       case oval: 
	    	   System.out.print("O"); 
	    	   break;
	       case fill:  
	    	   System.out.print("X"); 
	    	   break;
	    }
	 }
	

}
