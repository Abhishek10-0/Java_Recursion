package Arrays;

public class Sorted_or_not {
    public static void main(String[] args) {


        int[] arr = {1, 3, 5, 81, 8, 10, 19, 23, 46};

        System.out.println(Check(arr, 0));
    }

    static boolean Check(int[] arr,int index){
        if(index == arr.length - 1) {
            return true;
        }
        if(arr[index] < arr[index+1] && Check(arr, index+1) ){
            return true;
        }
        return false;
    }
}
