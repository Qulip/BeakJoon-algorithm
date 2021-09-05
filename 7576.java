package beak7576;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int m;
    static int n;
    static int[][] map;
    static boolean[][] changed;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int all_tomato = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==1){
                    all_tomato++;
                }
            }
        }
        int time = 1;
        while(true){
            changed = new boolean[n][m];
            int before = all_tomato;
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(map[i][j]==1&&!changed[i][j]){
                        change_1(i,j);
                    }
                }
            }
            if(before==all_tomato){
                time = -1;
                break;
            }
            time++;
        }
        System.out.println(time);
    }
    public static void change_1(int x, int y){
        for(int i=0; i<4; i++){
            int nextX = x + dr[i];
            int nextY = y + dc[i];
            if(nextX>=0 && nextY>=0 && nextX<n && nextY<n){
                if(map[nextX][nextY]==0) {
                    map[nextX][nextY] = 1;
                    changed[nextX][nextY] = true;
                    all_tomato++;
                }
            }
        }
    }
    /*
    public void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        while(!q.isEmpty()){
            int[] tmp = q.poll();
            int now_X = tmp[0];
            int now_Y = tmp[1];
            if(map[now_X][now_Y]==1||!visited[now_X][now_Y]){

            }

        }
    }
     */
}
/*
6 4
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 1
    out : 8
 */