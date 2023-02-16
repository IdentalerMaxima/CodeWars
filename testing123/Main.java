package testing123;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.

// Write a function which takes a list of strings and returns each line prepended by the correct number.

// The numbering starts at 1. The format is n: string. Notice the colon and space in between.

// Examples: (Input --> Output)

// [] --> []
// ["a", "b", "c"] --> ["1: a", "2: b", "3: c"]

public class Main {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(Arrays.asList("a", "b", "c"));

        function(strings);


        
    }

    public static List<String> function(List<String> strings){

        List<String> newStrings = new ArrayList<>();

        for(int i = 1; i <=  strings.size(); i++){
            //System.out.println(strings.get(i));
            String string = i + ". " + strings.get(i - 1);
            newStrings.add(i - 1, string);
            System.out.println(newStrings.get(i - 1));

        }




        return strings;
        

    }
}

