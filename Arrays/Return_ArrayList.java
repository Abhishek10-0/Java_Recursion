package Arrays;

import java.util.ArrayList;

public class Return_ArrayList {

    public static void main(String[] args) {
        int[] arr = {12, 67, 25, 67, 89, 67};
        int target = 67;

        // Calling the recursive function
        ArrayList<Integer> result = findAllIndexes(arr, target, 0);

        // Printing the result
        System.out.println("Target found at indexes: " + result);
    }

    // Recursive method that returns ArrayList without passing it
    static ArrayList<Integer> findAllIndexes(int[] arr, int target, int index) {
        ArrayList<Integer> result = new ArrayList<>();

        // Base case
        if (index == arr.length) {
            return result;
        }

        // If match found, add index to list
        if (arr[index] == target) {
            result.add(index);
        }

        // Recursively get rest of the list
        ArrayList<Integer> rest = findAllIndexes(arr, target, index + 1);

        // Add all from rest to result
        result.addAll(rest);

        return result;
    }
}
