package Easy;

import java.awt.desktop.SystemEventListener;

public class FibonacciNumber {

    public static void main(String[] args) {

        int n = 10;
        System.out.println(Fibo(n));
    }

    static int Fibo(int n){

        if(n < 2){
            return n;
        }

        return Fibo(n-1) + Fibo(n-2);

    }
}
