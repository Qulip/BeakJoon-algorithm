package beak2178;

import java.io.*;
import java.util.*;

public class Main {
    static int rst;
    static int row_max;
    static int col_max;
    static boolean[][] map;

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        rst = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        row_max = Integer.parseInt(st.nextToken());
        col_max = Integer.parseInt(st.nextToken());
        map = new boolean[row_max + 1][col_max + 1];
        for (int i = 1; i < row_max + 1; i++) {
            String tmp = br.readLine();
            for (int j = 1; j < col_max + 1; j++) {
                if (tmp.charAt(j - 1) == '1') {
                    map[i][j] = false;
                } else {
                    map[i][j] = true;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("수행시간: " + (end - start) + " ms");

        bfs(1, 1);
        System.out.println(rst);
    }
    static public void bfs(int row, int col){
        Queue<int[]> que = new LinkedList<>();
    }
}
/*      BFS Time Over
public class Main{
    static int rst;
    static int row_max;
    static int col_max;
    static boolean[][] map;
    public static void main(String[] args) throws IOException{
        long start = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        rst = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        row_max = Integer.parseInt(st.nextToken());
        col_max = Integer.parseInt(st.nextToken());
        map = new boolean[row_max+1][col_max+1];
        for(int i =1; i<row_max+1; i++){
            String tmp = br.readLine();
            for(int j=1; j<col_max+1; j++){
                if(tmp.charAt(j-1)=='1'){
                    map[i][j] = false;
                }else {
                    map[i][j] = true;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("수행시간: " + (end - start) + " ms");

        chk(1, 1, 1);
        System.out.println(rst);
    }
    public static void chk(int row, int col, int now_dist){
        if(map[row][col]){
            return;
        }else if(row==row_max&&col==col_max){
            rst = Math.min(rst,now_dist);
            //System.out.println("out!"+rst);
            return;
        }
        map[row][col] = true;
        //System.out.println("row:"+row+" col:"+col+" dist:"+now_dist);
        if(row!=1){
            chk(row-1,col, now_dist+1);
        }
        if(col!=1){
            chk(row,col-1, now_dist+1);
        }
        if(row!=row_max){
            chk(row+1,col, now_dist+1);
        }
        if(col!=col_max){
            chk(row,col+1, now_dist+1);
        }
        map[row][col] = false;
    }
}

4 6
101111
101010
101011
111011

 */