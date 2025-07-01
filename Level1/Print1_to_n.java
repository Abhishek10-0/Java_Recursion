package Level1;

import java.lang.classfile.attribute.SyntheticAttribute;

public class Print1_to_n {

    public static void main(String[] args) {

        int n = 10;
        printNumber(0,n);
    }

    static void printNumber(int current, int n){
        if(current > n){
           return;
        }
        System.out.println(current);
        printNumber(current+1, n);
    }
}
