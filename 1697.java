package beak1697;

import java.io.*;
import java.util.*;

public class Main {

    static int best;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        best = Integer.MAX_VALUE;
        DFS(x,y,0);
        System.out.println(best);
    }

    public static void DFS(int x, int y, int time){
        int dist = Math.abs(y-x);
        if(dist ==0){
            best = Math.min(best, time);
            return;
        }//여기 수정 필요
        if(!(dist<Math.abs(y-x*2))){
            DFS(x*2, y, time+1);
        }
        if(!(dist<Math.abs(y-x-1))) {
            DFS(x + 1, y, time + 1);
        }
        if(!(dist<Math.abs(y-x+1))) {
            DFS(x - 1, y, time + 1);
        }
    }
}
