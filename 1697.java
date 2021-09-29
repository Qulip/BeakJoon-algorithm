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
        DFS(x,y);
    }

    public static void DFS(int x, int y){

    }
}
