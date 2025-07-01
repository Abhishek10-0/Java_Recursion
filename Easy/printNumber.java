package Easy;

public class printNumber {

    public static void main(String[] args) {
        int n = 10;

        print(n);
    }

    static void print(int n){
        if(n>0) {
            System.out.println(n);

            print(n - 1);
        }

    }
}
