import java.util.Scanner; // Import the Scanner class

public class main {
    public static void main(String[] args) {
        char [][] board = startingBoard(); //creats basic chessboard
        Scanner s = new Scanner(System.in); //abreviates scanner as 's'

        while (true){ //main game loop
            System.out.println("\n1:\tShow board as white" + "\n2:\tShow board as black" + "\n3:\tQuit"); //shows input options to user
            int userInput = s.nextInt(); //gets user input
            if(userInput == 1){ //displays board as white
                showBoardAsWhite(board);
            } else if (userInput == 2) { //displays board as black
                showBoardAsBlack(board);
            } else if (userInput == 3) { //exits the loop
                break;
            } else { //prompts user to retry for incorrect input
                System.out.println("\nUnknown input, please try again\n");
            }
        }
        s.close(); //closes Scanner to prevent memory leak
    }

    public static char[][] startingBoard(){ //returns starting chess board
        char [][]startBoard = {{'R','H','B','Q','K','B','H','R'},
        {'P','P','P','P','P','P','P','P'},
        {'0','0','0','0','0','0','0','0'},
        {'0','0','0','0','0','0','0','0'},
        {'0','0','0','0','0','0','0','0'},
        {'0','0','0','0','0','0','0','0'},
        {'P','P','P','P','P','P','P','P'},
        {'R','H','B','Q','K','B','H','R'}};
        return startBoard;
    }

    public static void showBoardAsWhite(char [][]board){ //displays the chess board with cordiantes as white
        System.out.println("\n\tWhite:");
        for(int i = 0; i < board.length; i++){
            System.out.print(((i)-8)*-1); //prints the numbers on the left side of the board
            for(int j = 0; j < board[i].length; j++){
                System.out.print(" " + board[i][j]); //displays the current peice at location (i,j)
            }
            System.out.print("\n"); //new line
        }
        for(int k = 65; k < board[0].length+65; k++){ //prints the letters at the bottom of the board
            if(k == 65) {
                System.out.print(" "); //shifts the letters over by one more space
            }
            System.out.print(" " + (char)k); //prints the letters by ascii values starting at 65
        }
    }

    public static void showBoardAsBlack(char [][]board){ //displays the chess board with cordiantes as black
        System.out.println("\n\tBlack:");
        for(int i = board.length-1; i >= 0; i--){
            System.out.print((i-8)*-1); //prints the numbers on the left side of the board
            for(int j = board[i].length-1; j >= 0; j--){
                System.out.print(" " + board[i][j]); //displays the current peice at location (i,j)
            }
            System.out.print("\n"); //new line
        }
        for(int k = 72; k > board[0].length+56; k--){ //prints the letters at the bottom of the board
            if(k == 72) {
                System.out.print(" "); //shifts the letters over by one more space
            }
            System.out.print(" " + (char)k); //prints the letters by ascii values starting at 65
        }
    }
}
