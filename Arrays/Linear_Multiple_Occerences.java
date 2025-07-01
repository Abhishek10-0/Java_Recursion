package Arrays;

import java.util.ArrayList;

public class Linear_Multiple_Occerences {
    public static void main(String[] args) {

        int[] arr = {12, 25, 26, 67, 67,89};
        int target = 67;
        FindAllIndexes(arr, target,0);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void FindAllIndexes(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }if(arr[index] == target){
            list.add(index);
        }
            FindAllIndexes(arr, target,index+1);

    }
}
