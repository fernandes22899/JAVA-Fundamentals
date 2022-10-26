import java.util.Scanner;
public class TicTacToe
{
    
    public static void main( String[] args){
        int[][] matrix = {
            {8, 8, 8}, 
            {8, 8, 8}, 
            {8, 8, 8}, 
      };
      
     
     for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
             System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
     }
     Scanner input = new Scanner(System.in);
     
     System.out.println("Where would you like to land first?");
     int num = input.nextInt();
    }
}