package Arrays;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {

        int[] arr = {23,45,43,21, 78,43,13,42,53};

        arr = mergesort(arr);

        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr){

        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid ));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length ));

        return merge(left,right);
    }

    static int[] merge(int[] first, int[] second){
        int i = 0;
        int j = 0;
        int k = 0;

        int[] mix = new int[first.length + second.length];
        while (i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
