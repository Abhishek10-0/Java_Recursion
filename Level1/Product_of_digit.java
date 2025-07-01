package Level1;

public class Product_of_digit {
    public static void main(String[] args) {


                int n = 1234;

                System.out.println(Sum(n));
            }

            static int Sum(int n){

                if(n%10 == n){
                    return n;
                }

                return (n%10) * Sum(n/10);
            }
        }


