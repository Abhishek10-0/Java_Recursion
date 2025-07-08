package Strings;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        permutations("", "abc");

        System.out.println(permutationsList("", "abc"));
    }

    static void permutations(String p, String str){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = str.charAt(0);

        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            permutations(f + ch + l,str.substring(1));
        }
    }

    static ArrayList<String> permutationsList(String p, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }

        char ch = str.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            ans.addAll(permutationsList(f + ch + l,str.substring(1)));

        }
        return ans;
    }

}




//
//1)    p = "", str = "abc", ch = 'a'
//      f = "", l = "" → call permutations
//
//2)    p = "a", str = "bc", ch = 'b'
//      i = 0: f = "", l = "a" → call permutations("ba", "c")
//
//      i = 1: f = "a", l = "" → call permutations("ab", "c")

//... and so on.
