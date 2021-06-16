package beak18352;

import java.io.*;
import java.util.*;

public class Main {
    static ArrayList[] ways;
    static int[] nodes;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        nodes = new int[n+1];
        Arrays.fill(nodes,Integer.MAX_VALUE);
        nodes[x] = 0;
        for(int i=0; i<=n; i++){
            ways[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            ways[start].add(end);
        }
        dijikstra(x, k);
    }
    public static void dijikstra(int start, int finish){
        int now_length = 1;
        Queue<Integer> next = new LinkedList<>();
        next.add(start);
        while(true){
            for(int i=0; i<next.size(); i++) {
                int next_node = next.poll();
                for (int j = 0; j < ways[next_node].size(); j++) {

                }
            }
        }
    }
}