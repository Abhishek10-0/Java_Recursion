package Easy;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1, 3 , 5, 7 ,9 ,10 ,24 ,45};
        int target = 7;
        int start = 0;
        int end = arr.length-1;

        System.out.println(Search(arr, target, start, end));
    }


    static int Search(int[] arr, int target, int start, int end){

        int mid = start + (end-start)/2;

        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] > target){
            return Search(arr, target, start, mid-1);
        }else if(arr[mid] < target){
            return Search(arr, target, mid+1, end);
        }

        return -1;
    }
}
