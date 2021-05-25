package tictactoe;

/**
 * 
 * @author Manasi Mangalvedhe
 *
 */

public class TicTacToe {
	
	    private String[][] board;
	    private int turn;
	    
	    /**
	     * Creates a new Tic Tac Toe board.  Instantiates the 3x3 board
	     * with all dashes or other place holders.
	     * 
	     * initializes number of turns taken to equal 0
	     */
	    
	    public TicTacToe() {
	    	turn = 0;
	    	board = new String[3][3];
	    	for(int row = 0; row < board.length; row++) {
	    		for(int col = 0; col < board[row].length; col++) {
	    			board[row][col] = "-";
	    		}
	    	}
	    }
	    
	    
	   
	    /**
	     * Getter method for current turn number
	     * @return number of turns taken
	     */
	    
	    public int getTurn() {
	    	return turn;
	    }
	    
	    
	    
	   
	   /**
	    * This method prints out the board array on to the console
	    */
	    
	   public void printBoard()
	   {
	       for(String[] row : board) {
	    	   for(String col : row) {
	    		   System.out.print(col + " ");
	    	   }
	    	   System.out.println();
	       }
	       
	   }
	   
	   /**
	    * 
	    * This method determines if space row, col is an available space to choose
	    * @return: true if the board[row][col] is available, false otherwise
	    * 
	    */
	   
	   public boolean pickLocation(int row, int col)
	   {
	        return board[row][col].equals("-");
	   }
	   
	   /**
	    * 
	    * This method places an X or O at board[row][col] based on the int turn
	    */
	   
	   public void takeTurn(int row, int col)
	   {
		   if(turn % 2 == 0) {
			   board[row][col] = "X";
		   }
		   else {
			   board[row][col] = "O";
		   }
		   turn++;
	   }
	   
	   /**
	    * 
	    * This method checks if any row has all X's or all Os
	    * @return: true if there is a row with all the same value, false otherwise. 
	    */
	   
	   
	   public boolean checkRow()
	   {
		   for(int r = 0; r < board.length; r++) {
			   if(board[r][0].equals("X") || board[r][0].equals("O")) {
				   if(board[r][0].equals(board[r][1]) && board[r][1].equals(board[r][2])) {
					   return true;
				   }
			   }
		   }
		   return false;
	   }
	   
	   
	   /**
	    * 
	    * This method checks if any col has all X's or all Os
	    * @return: true if there is a col with all the same value, false otherwise. 
	    */
	   
	   public boolean checkCol()
	   {
		   for(int c = 0; c < board[0].length; c++) {
			   if(board[0][c].equals("X") || board[0][c].equals("O")) {
				   if(board[0][c].equals(board[1][c]) && board[1][c].equals(board[2][c])) {
					   return true;
				   }
			   }
		   }
		   return false;
	   }
	   
	   
	   /**
	    * 
	    * This method checks if either diagonal has all X's or all Os
	    * @return: true if either diagonal with all the same value, false otherwise. 
	    */
	   
	   public boolean checkDiag()
	   {
		   if(board[0][0].equals("X") || board[0][0].equals("O")) {
			   if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
				   return true;
			   }
		   }
		   else if(board[0][2].equals("X") || board[0][2].equals("O")) {
			   if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
				   return true;
			   }
	   	   }
		   return false;
	   }
	   
	   /**
	    * 
	    * This method checks if a player has won the game via a row, col, or diagonal
	    * @return: true if the game is won, false otherwise
	    */
	   public boolean checkWin()
	   {
	       return (checkRow() || checkCol() || checkDiag());
	   }

}
