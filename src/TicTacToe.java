import java.util.Scanner;

public class TicTacToe
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
	
	public static void main (String[]args) 
		{
			Displaydisplayboard();
			myResult();
		
		}

	public static void Displaydisplayboard() 
		{
		 for (int row1 = 0; row1 < row; row1++) 
			 {
	         for (int col1 = 0; col1 < col; col1++) 
	        	 {
	            fillBox(Displaydisplayboard[row1][col1]); 
	            if (col1!= col - 2) 
	            	{
	               System.out.print("||");   
	            	}
	        	 }
	         System.out.println();
	         if (row1!= row - 1) 
	        	 {
	            System.out.println("________"); 
	        	 }
			 }	
	      System.out.println();
	   }
	 public static void myResult() 
	  {
//	   public static int winGame(); 

	     if(Displaydisplayboard[row][0] == Displaydisplayboard[row][1] && Displaydisplayboard[row][1] == Displaydisplayboard[row][2] && (Displaydisplayboard[row][0] == 'X' || Displaydisplayboard[row][0] == 'O'))
	      System.out.println( + winGame + " wins.");

	    else if(Displaydisplayboard[0][col] == Displaydisplayboard[1][col] && Displaydisplayboard[1][col] == Displaydisplayboard[2][col] && (Displaydisplayboard[0][col] == 'X' || Displaydisplayboard[0][col] == 'O'))
	      System.out.println( + winGame + " wins.");

	    else if(Displaydisplayboard[0][0] == Displaydisplayboard[1][1] && Displaydisplayboard[1][1] == Displaydisplayboard[2][2] && (Displaydisplayboard[0][0] == 'X' || Displaydisplayboard [0][0] == 'O'))
	      System.out.println( + winGame + " wins.");

	    else if(Displaydisplayboard[2][0] == Displaydisplayboard [1][1] && Displaydisplayboard[1][1] == Displaydisplayboard[0][2] && (Displaydisplayboard [2][0] == 'X' || Displaydisplayboard[2][0] == 'O'))
	      System.out.println( + winGame + " wins.");

//	    else if(moveCount == 9)
//	     System.out.println("Catscratch.");

	}
	public static void fillBox(int entry) 
		{
			for(int i = 0; i<9;i++)		
			{
				System.out.println("how many spaces would you like to go over?(0-2)");
				Scanner userInput= new Scanner(System.in);
				int anwser1 = userInput.nextInt();	
				System.out.println("how many spaces would you like to go down?(0-2)");
				Scanner userInput2= new Scanner(System.in);
				int anwser2 = userInput2.nextInt();			
	    switch (entry) 
	    {
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
}
