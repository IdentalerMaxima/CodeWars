package stringMinMx;

public class Main{
    
    public static void main(String[] args) {
    
        int[] arr = function("1 2 3 4 5 6 7 -1222222 8 9");

        int min, max;

        min = max = arr[0];

        for (int i : arr) {
            

            if(i < min){
                min = i;
            }else if(i > max){
                max = i;
            }
        }

        System.out.println(min + "-" + max);

    }

    static int[] function(String string){
        
        String[] stringArr = string.split(" ", 0);
        int[] intArr = new int[stringArr.length];

        //System.out.println(stringArr.length);

        for(int i = 0; i < stringArr.length; i++){

            intArr[i] = Integer.parseInt(stringArr[i]);
            System.out.println(intArr[i]);

        }

        return intArr;
 
    }
   
}
