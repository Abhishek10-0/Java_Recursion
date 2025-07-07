package Arrays;

import java.util.ArrayList;

public class Return_ArrayList {
    public static void main(String[] args) {
        int[] arr = {12,4,5,4,7,4,89,69};
        int target = 4;

        ArrayList<Integer> list = new ArrayList<>();

        findAllIndexes(arr, target, 0, list);
        findAllIndexes(arr, target, 0);

        System.out.println(list);
        System.out.println(findAllIndexes(arr, target, 0));
    }


//    Passing with argument
    static ArrayList<Integer> findAllIndexes(int[] arr , int target, int index, ArrayList<Integer> list){

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return findAllIndexes(arr,target, index+1, list);
    }


//    Passing without an Argument
    static ArrayList<Integer> findAllIndexes(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansfromBelow = findAllIndexes(arr,target,index+1);

        list.addAll(ansfromBelow);

        return list;

    }
}

