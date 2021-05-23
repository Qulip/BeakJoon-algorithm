package beak1753;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());
        int[][] ways = new int[v+1][v+1];
        int[] k_ways = new int[v+1];
        for(int i=1; i<=v; i++) {
            Arrays.fill(ways[i], Integer.MAX_VALUE);               //두점 사이 거리가 10이하의 자연수라 11로 채움
            ways[i][i] = 0;
        }
        for(int i=0; i<e; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int finish = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());
            if(ways[start][finish]>dist){
                ways[start][finish]=dist;
            }
        }
        k_ways = ways[k];
        int num = 1;
        int next_point = 0;
        boolean[] chk = new boolean[v+1];
        chk[k] = true;
        while(num<v){
            int dist= Integer.MAX_VALUE;
            for(int i=1; i<=v; i++){
                if(dist>ways[k][i]&&!chk[i]){
                    next_point = i;
                    dist = ways[k][i];
                }
            }
            chk[next_point]=true;
            for(int i=1; i<=v; i++){
                if(!chk[i]&&dist+ways[next_point][i]<ways[k][i]){
                    ways[k][i] = dist+ways[next_point][i];
                }
            }
            num++;
        }
        /*for(int i=1; i<=v; i++){
            for(int j=1; j<=v; j++){
                for(int l=1; l<=v; l++){
                    ways[j][l] = Math.min(ways[j][l], ways[j][i]+ways[i][l]);
                }
            }
        }
        //메모리부족
        */for(int i=1; i<=v; i++){
            System.out.print(k_ways[i]+" ");
        }
        for(int i=1; i<=v;i++){
            if(ways[k][i]==11){
                sb.append("INF\n");
            }else{
                sb.append(ways[k][i]+"\n");
            }
        }
        System.out.println(sb);
    }
}
/*
5 6
1
5 1 1
1 2 2
1 3 3
2 3 4
2 4 5
3 4 6

 */
