package Arrays;

public class Linear_Search {
    public static void main(String[] args) {

        int[] arr = {2,4,6,9,18,27,63};
        int target = 9;
        System.out.println(Search(arr, target, 0));
    }
    static int Search(int[] arr, int target , int index){
        if(index == arr.length){
            return -1;
        }if(arr[index] == target){
            return index;
        }else{
           return Search(arr, target,index+1);
        }
    }
}
