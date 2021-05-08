package beak11727;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(bf.readLine());

        //bottom-up
        int d[] = new int[length+1];
        d[0] = 1;
        d[1] = 1;
        for (int i = 2; i <= length; i++){
            d[i] = d[i-1] + d[i-2] + d[i-2];
            d[i] %= 10007;
        }
        System.out.println(d[length]);
    }
}
