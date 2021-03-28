package beak10989;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(input.readLine());
        StringBuilder sb = new StringBuilder();
        int[] nums = new int[tc];
        for(int i=0; i<tc; i++) {
            nums[i]=Integer.parseInt(input.readLine());
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            sb.append(nums[i]+"\n");
        }
        System.out.print(sb);
    }
}