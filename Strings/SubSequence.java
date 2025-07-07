package Strings;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String str = "abc";
        String p = "";

        ArrayList<String> list = new ArrayList<>();
        subseq(p,str, list);

        System.out.println(list);
    }


    static ArrayList<String> subseq(String p, String str,ArrayList<String> list){
        if(str.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = str.charAt(0);

        subseq(p+ch,str.substring(1),list);
        subseq(p,str.substring(1),list);


        return list;
    }



//    static void subseq(String p, String str) {
//        // Base case: when input string is empty, print the current subsequence
//        if (str.isEmpty()) {
//            System.out.println(p);
//            return;
//        }
//
//        // Take first character
//        char ch = str.charAt(0);
//
//        // Include the character
//        subseq(p + ch, str.substring(1));
//
//        // Exclude the character
//        subseq(p, str.substring(1));
//    }
}
