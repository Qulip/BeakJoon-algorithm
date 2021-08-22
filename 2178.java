package beak2178;

import java.io.*;
import java.util.*;

public class Main{
    static int rst;
    static int row;
    static int col;
    static boolean[][] map;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        rst = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        map = new boolean[row+1][col+1];
        for(int i =1; i<row+1; i++){
            String tmp = br.readLine();
            char[] tmp_arr = tmp.toCharArray();
            for(int j=1; j<tmp_arr.length+1; j++){
                if(tmp_arr[j]=='1'){
                    map[i][j] = false;
                }else {
                    map[i][j] = true;
                }
            }
        }
        chk(1, 1, 1);
    }
    public static void chk(int row, int col, int now_dist){
        if(map[row][col]){
            return;
        }
        map[row][col] = true;
    }
}