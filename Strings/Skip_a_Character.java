package Strings;

public class Skip_a_Character {
    public static void main(String[] args) {

        String str = "baccdah";
        String p = "";

        skip(p,str);

        System.out.println(skip(str));

    }

    static void skip(String p , String str){

        if(str.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = str.charAt(0);

        if(ch == 'a'){
            skip(p,str.substring(1));
        } else {
            skip(p+ch, str.substring(1));
        }
    }

    static String skip(String str){

        if(str.isEmpty()){
            return "";

        }

        char ch = str.charAt(0);

        if(ch == 'a'){
           return skip(str.substring(1));
        } else {
           return  ch + skip(str.substring(1));
        }
    }
}


