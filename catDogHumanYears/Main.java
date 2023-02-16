package catDogHumanYears;

public class Main {

    public static void main(String[] args) {

        int[] arr = humanYearsCatYearsDogYears(3);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
    public static int[] humanYearsCatYearsDogYears(final int humanYears){
        int[] arr = new int[3];
        
        if(humanYears == 1){
            int[] arr1 = {1, 15, 15};
            return arr1;
        }
        else if(humanYears == 2){
            int[] arr2 = {2, 24, 24};
            return arr2;
        }
        else{
            arr[0] = humanYears;
            arr[1] = 24 + ((humanYears-2) * 4);
            arr[2] = 24 + ((humanYears-2) * 5);
        return arr;
        }
    } 
}
