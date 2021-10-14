package beak11052;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] cards = new int[n];
        for(int i=0; i<n; i++){
            cards[i] = Integer.parseInt(st.nextToken());
        }
    }
}
