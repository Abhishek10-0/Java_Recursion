package Strings;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        pad("","23");

        System.out.println(padlist("","23"));

        System.out.println(padcount("" , "23"));

    }
    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; //This will convert '2' into 2;


        for (int i = (digit - 1) * 3; i< digit*3; i++){
            char ch = (char) ('a' + i);
            pad(p+ch,up.substring(1));
        }
    }


    static ArrayList<String> padlist(String p, String up) {

        ArrayList<String> list = new ArrayList<>();

        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0'; //This will convert '2' into 2;


        for (int i = (digit - 1) * 3; i< digit*3; i++){
            char ch = (char) ('a' + i);
            ArrayList<String> charlist = padlist( p+ch, up.substring(1));

            list.addAll(charlist);
        }
        return list;
    }


    static int padcount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        int digit = up.charAt(0) - '0';

        int count = 0;

        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a' + 1);
            count = count + padcount(p+ch,up.substring(1));


        }
        return count;
    }
}
