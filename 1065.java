package beak1065;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        if(n<100){
            sb. append(n);
        }else if(n<111){
            sb.append("99");
        }else{
            int result = 99;
            int[] nums = new int[3];
            int i = 111;
            while(i<=n){
                nums[0] = n/100;
                nums[1] = (n%100)/10;
                nums[2] = n%10;
                if()
            }

        }
    }
}
