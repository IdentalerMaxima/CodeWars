package reverseArr;

public class Main {

    static void reverse(int intArr[], int size) {
        for(int i = 0; i < size; i++){
            int reversedArray[] = new int[size];
            reversedArray[i] = intArr[size - 1 - i];
            System.out.println(reversedArray[i]);
        }
    }

    public static void main(String[] args) {

        //int ints[] = {1, 2, 3};

        /* System.out.println(ints.length); */

        /* for (int i : ints) {
            System.out.println(i);
        } */

        int intArr[] = new int[10];

        for(int a = 0; a < intArr.length; a++){
            intArr[a] = a;
            System.out.println(intArr[a]);
        }

        System.out.println("-----------------------------------");

        reverse(intArr, 10);

    }
}
