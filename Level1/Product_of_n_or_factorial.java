package Level1;

public class Product_of_n_or_factorial {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Product(n));
    }

    static int Product(int n){
        if(n == 1){
            return 1;
        }

        return n * Product(n-1);
    }
}
