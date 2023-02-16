package arrMinMax;

import java.util.Arrays;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};


        int[] res = minMax(arr);

        for (int i : res) {
            System.out.println(i);
        }


    }
    public static int[] minMax(int[] arr){

        // int min, max;

        // min = max = arr[0];

        // for (int i : arr) {
        //     if(i > max){
        //         max = i;
        //     }else if(i < min){
        //         min = i;
        //     }
        // }

        // int[] minMax = new int[2];
        // minMax[0] = min;
        // minMax[1] = max;

        // return minMax;

        //Better solution
        Arrays.sort(arr);
        return new int[]{arr[0], arr[arr.length - 1]};

    }

    
}