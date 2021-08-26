package beak2667;

import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[][] map;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        visited = new boolean[n][n];
        visited[0][0] = true;
        map = new int[n][n];
        for(int i=0; i<n; i++){
            String tmp = br.readLine();
            for(int j=0; j<n; j++){
                map[i][j] = tmp.charAt(j)-'0';
            }
        }
    }
}
