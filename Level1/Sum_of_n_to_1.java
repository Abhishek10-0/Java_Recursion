package Level1;



public class Sum_of_n_to_1 {
    public static void main(String[] args) {

        int n = 10;

        System.out.println(Sum(n));
    }

    static int Sum(int n){
        if(n == 0){
            return 0;
        }
        return n + Sum(n-1);
    }
}
