package Arrays;

public class Rotated_Binary_Search {
    public static void main(String[] args) {

        int[] arr = {35,67,78,89,1,4,5,8,9,19,27};

        int target = 9;

        System.out.println(Search(arr, target, 0, arr.length-1));
    }

    static int Search(int[] arr, int target,int start,int end){
        if(start>end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[start] <= arr[mid]) {
            if (arr[start] <= target && arr[end] >= target) {
                return Search(arr, target, start, mid - 1);
            }else{
                return Search(arr, target, mid+1, end);
            }
        }
        if (target >= arr[mid] && target <= arr[end]){
            return Search(arr,target,mid+1, end);

        }
        return Search(arr, target, start, mid-1);
    }
}
