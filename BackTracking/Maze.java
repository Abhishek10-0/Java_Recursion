package BackTracking;

import java.util.ArrayList;

public class Maze {

    public static void main(String[] args) {
        System.out.println(count(3,3));

        path("", 3,3);

        System.out.println(Retpath("", 3,3));

        System.out.println((RetpathDiagonal("", 3,3)));

        boolean[][] board = {
                {true,true,true,true},
                {true,false,true,true},
                {true,true,true,true},
                {true,true,true,true}
        };

        System.out.println(pathRestriction("",board,0,0));

    }

    static int count(int r , int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = count(r-1,c);
        int right = count(r,c-1);

        return left+right;
    }

    static void path(String p, int r, int c){

        if (r == 1 && c ==1){
            System.out.println(p);
            return;
        }

        if (r>1){
            path(p + 'D', r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }

    static ArrayList<String> Retpath(String p, int r, int c){

        if (r == 1 && c ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r>1){
            list.addAll(Retpath(p + 'D', r-1,c));
        }
        if(c>1){
            list.addAll(Retpath(p+'R',r,c-1));
        }

        return list;
    }

    static ArrayList<String> RetpathDiagonal(String p, int r, int c){

        if (r == 1 && c ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c>1) {
            list.addAll(Retpath(p + 'D', r-1,c-1));
        }

        if (r>1){
            list.addAll(Retpath(p + 'V', r-1,c));
        }
        if(c>1){
            list.addAll(Retpath(p+'H',r,c-1));
        }

        return list;
    }

    static ArrayList<String> pathRestriction(String p, boolean[][] maze, int r,int c){
        if(r == maze.length-1 && c == maze[0].length -1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(!maze[r][c]){
            return list;
        }

        if(r < maze.length-1 && c < maze[0].length-1){
            list.addAll(pathRestriction(p+"D",maze,r+1,c+1));
        }

        if(r < maze.length-1){
            list.addAll(pathRestriction(p+"V",maze,r+1,c));
        }
        if(c < maze[0].length-1){
            list.addAll(pathRestriction(p+"H",maze,r,c+1));
        }

        return list;
    }

}
