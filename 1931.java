package beak1931;

import java.io.*;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] classes = new int[n][2];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            classes[i][0] = Integer.parseInt(st.nextToken());
            classes[i][1] = Integer.parseInt(st.nextToken());
        }


    }
}


class classes {
    private int start;
    private int finish;
    classes(int x, int y){
        start=x;
        finish=y;
    }
    public int getStart(){
        return start;
    }
    public int getFinish(){
        return finish;
    }
}
