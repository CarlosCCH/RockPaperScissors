package rockpaperscissors;
import java.util.Scanner;
import java.util.Random; 
public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        int computerNum;
        String userPlay;
        String computerPlay = "";
        String response;
        
  
        System.out.println("Enter R for Rock, P for Paper, or S for Scissors: \n");
            userPlay = scan.next();
            
         userPlay = userPlay.toUpperCase(); 
       
         computerNum = generator.nextInt(3)+1;
        
        if (computerNum == 1)
            computerPlay = "R";
        else if (computerNum == 2)
            computerPlay = "P";
        else if (computerNum == 3)
            computerPlay = "S";
      System.out.println("Computer's play is: "+ computerPlay); 
                    
     if (userPlay.equals(computerPlay))        
            System.out.println("It's a tie!");
        else if (userPlay.equals("R"))
            if (computerPlay.equals("S")) 
          System.out.println("Rock crushes scissors. You win!");
        else if (computerPlay.equals("P")) 
            System.out.println("Paper eats rock. You lose!"); 
        else if (userPlay.equals("P")) 
             if (computerPlay.equals("S")) 
        System.out.println("Scissor cuts paper. You lose!"); 
        else if (computerPlay.equals("R")) 
            System.out.println("Paper eats rock. You win!"); 
        else if (userPlay.equals("S")) 
            if (computerPlay.equals("P")) 
         System.out.println("Scissor cuts paper. You win!"); 
        else if (computerPlay.equals("R")) 
            System.out.println("Rock breaks scissors. You lose!"); 
    else 
         System.out.println("Invalid user input.");
    }
    
}

// Goood job
