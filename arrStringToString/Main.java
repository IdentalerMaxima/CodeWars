package arrStringToString;

public class Main {

    public static void main(String[] args) {

        System.out.println(function(new String[] { "Bilal", "Bilal", "Bilal" }));
    }

    public static String function(String[] arr) {

        // String res = "";
        // if (arr.length == 1) {
        // res = arr[0];
        // } else {
        // for (int i = 0; i < arr.length - 1; i++) {

        // res += arr[i];
        // res += " ";

        // }

        // res += arr[arr.length - 1];

        // }

        // return res;

        // }

        // better solution

        return String.join(" ", arr);

    }

}
