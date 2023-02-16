package rockPaperScissors;

// Let's play! You have to return which player won! In case of a draw return Draw!.

// Examples(Input1, Input2 --> Output):

// "scissors", "paper" --> "Player 1 won!"
// "scissors", "rock" --> "Player 2 won!"
// "paper", "paper" --> "Draw!"

public class Main {

    public static void main(String[] args) {
        
        System.out.println(function("scissors", "paper"));
        
        
    }
    
    public static String function(String choice1, String choice2){

        switch(choice1){
            case "scissors": {
                
                if(choice2 == "scissors") return ("Draw!");
                if(choice2 == "paper") return ("Win!");
                if(choice2 == "rock") return ("Lose!");
                break;

            }
            case "paper": {
                
                if(choice2 == "scissors") return ("Lose!");
                if(choice2 == "paper") return ("Draw!");
                if(choice2 == "rock") return ("Win!");
                break;

            }
            case "rock": {
                
                if(choice2 == "scissors") return ("Win!");
                if(choice2 == "paper") return ("Lose!");
                if(choice2 == "rock") return ("Draw!");
                break;

            }
        }

        return "";

    }
}
