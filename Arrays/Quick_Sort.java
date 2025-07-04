package Arrays;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {

        int[] arr = {12, 43, 55, 54, 234, 144, 23, 133, 411, 34, 34, 24, 532, 89, 968, 543, 546, 766};

        quicksort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void quicksort(int[] arr, int start, int end) {
        if (start < end) {
            int pivInd = partition(arr, start, end);

            quicksort(arr, start, pivInd - 1);
            quicksort(arr, pivInd + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int idx = start - 1;
        int pivot = arr[end];

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                idx++;
                swap(arr, idx, j);
            }
        }
        idx++;
        swap(arr, idx, end);

        return idx;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
