package ruplayingbanjo;

// Create a function which answers the question "Are you playing banjo?".

// If your name starts with the letter "R" or lower case "r", you are playing banjo!

// The function takes a name as its only argument, and returns one of the following strings:

// name + " plays banjo" 
// name + " does not play banjo"
// Names given are always valid strings.

public class Main {

    public static void main(String[] args) {

        System.out.println(function("AAA"));
        

    }
    public static String function(String name){

        String string = name;

        char[] charArr = string.toCharArray();

        if(charArr[0] == 'r' || charArr[0] == 'R'){

            return (name + " plays banjo");

        }
        else{

            return (name + " does not play banjo");

        }
 

    }

}
