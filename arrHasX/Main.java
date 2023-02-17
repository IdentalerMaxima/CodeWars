package arrHasX;

// You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.

// Array can contain numbers or strings. X can be either.

// Return true if the array contains the value, false if not.

public class Main {

    public static void main(String[] args) {

        Object[] arr = new Object[3];
        // arr[0] = "hello";

        Object obj = 11;

        arr[1] = obj;

        System.out.println(function(arr, 11));

    }

    public static boolean function(Object[] arr, Object obj) {

        boolean contains = false;

        for (Object object : arr) {

            if (object == obj)
                contains = true;

        }

        return contains;
    }
}


// quick solution

// import java.util.Arrays;

// public class Solution {

//     public static boolean check(Object[] a, Object x) {
//         return Arrays.asList(a).contains(x);
//     }

// }
