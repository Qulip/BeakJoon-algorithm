package beak7576;

import java.io.*;
import java.util.*;

public class Main {
    static int m;
    static int n;
    static int[][] map;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int all_tomato = 0;
    static int all_box = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]!=-1){
                    all_box++;
                }
                if(map[i][j]==1){
                    q.add(new int[]{i, j});
                    all_tomato++;
                }
            }
        }
        int time;
        if(all_tomato==all_box){
            time=0;
        } else {
            time=1;
            while (true) {

            }
        }
        System.out.println(time);
    }

    public Queue<int[]> bfs(Queue<int[]> q){
        Queue<int[]> new_que = new LinkedList<>();
        while(!q.isEmpty()){
            int[] tmp = q.poll();
            int x = tmp[0];
            int y = tmp[1];
            for(int i=0; i<4; i++){
                int nextX = x + dr[i];
                int nextY = y + dc[i];
                if(nextX>=0 && nextY>=0 && nextX<n && nextY<m){
                    //System.out.println(nextX+" "+nextY);
                    if(map[nextX][nextY]==0) {
                        map[nextX][nextY] = 1;
                        all_tomato++;
                    }
                }
            }
        }
        return new_que;
    }
}

/*
6 4
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 1
    out : 8
 */