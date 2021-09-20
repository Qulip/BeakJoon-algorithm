package test4;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12)));
        System.out.println(Arrays.toString(solution(18)));

    }
    public static int[] solution(int n) {
        int[] n_arr = new int[n];
        for(int i=0; i<n; i++){
            n_arr[i] = i+1;
        }
        int[] answer = split(n_arr);
        return answer;
    }
    public static int[] split(int[] arr){
        int len = arr.length;
        if(len==1){
            return arr;
        }
        int p = 2;
        while (len % p != 0) {
            p++;
        }
        int[][] ing = new int[p][len/p];
        for(int i=0; i<len; i++){
            ing[i%p][i/p] = arr[i];
        }
        for(int i=0; i<p; i++){
            ing[i] = split(ing[i]);
        }
        int n = 0;
        for(int i=0;i<ing.length; i++){
            for(int j=0; j<ing[i].length; j++){
                arr[n] = ing[i][j];
                n++;
            }
        }
        return arr;
    }
}
