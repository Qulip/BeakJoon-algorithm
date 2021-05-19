package beak1146;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int distance = Integer.parseInt(st.nextToken());
        beak1146.Short_cut[] ways = new beak1146.Short_cut[n];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            ways[i] = new beak1146.Short_cut(x,y,z);
        }
        Arrays.sort(ways);
        for(int i=0; i<n; i++){
            System.out.println(ways[i].start+" "+ways[i].finish+" "+ways[i].distance);
        }
        boolean[] used = new boolean[n];
        for(int i=0; i<n; i++){
            if(ways[i].finish<=n){
                for(int j=0; j<i; j++){
                    if(used[j]){

                    }
                }
            }
        }
    }
}

class Short_cut implements Comparable<beak1146.Short_cut>{
    int start;
    int finish;
    int distance;
    Short_cut(int x, int y, int z){
        start = x;
        finish = y;
        distance = z;
    }
    @Override
    public int compareTo(beak1146.Short_cut o){
        if(this.distance != o.distance){
            return this.distance - o.distance;
        }else{
            int a = this.finish-this.start;
            int b = o.finish - o.start;
            return b-a;
        }
    }
}
/*
5 150
0 50 10
0 50 20
50 100 10
100 151 10
110 140 90

 */