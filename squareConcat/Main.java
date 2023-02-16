package squareConcat;

public class Main {

    public static void main(String[] args) {
        function(9119);
    }
    public static void function(int num){
        String string = String.valueOf(num);
        
        char[] chararr = string.toCharArray();

        String result = "";

        for (char c : chararr) {
            int toadd = Character.getNumericValue(c) * Character.getNumericValue(c);
            result += toadd;
        }

        System.out.println(result);

     
        
    }
    
}
