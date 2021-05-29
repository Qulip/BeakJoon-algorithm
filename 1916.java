package beak1916;

import java.io.*;
import java.util.*;

public class Solution {
    static int n;
    static int m;
    static ArrayList<Node>[] list;
    static int rst;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        list = new ArrayList[n+1];
        rst = 0;
        for(int i=1; i<=n; i++){
            list[i] = new ArrayList<Node>();
        }
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            list[start].add(new Node(end, weight));
        }
        dijkstra();
    }
    static public void dijkstra(){
        PriorityQueue<Node> queue = new PriorityQueue<>();
        boolean[] chk = new boolean[n+1];
        chk[1] = true;
        queue.add(new Node(1,0));
        while (!queue.isEmpty()){

        }
    }
}

class Node implements Comparable<Node>{

    private int end, weight;

    Node(int end, int weight){
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o){
        return this.weight - o.weight;
    }

}
