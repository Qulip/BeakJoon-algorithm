package test1_1;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 1, 0, 0},1));
        //System.out.println();
        System.out.println(solution(new int[]{0,1,0,0,1,1,0},2));
        //System.out.println();
        System.out.println(solution(new int[]{0, 1, 0},2));
    }
    public static int solution(int[] student, int k){
        int answer = 0;
        ArrayList<Integer> old = new ArrayList<>();
        for(int i=0; i<student.length; i++){
            if(student[i]==1){
                old.add(i);
            }
        }
        if(k<=old.size()){
            for(int i=0; i<=old.size()-k; i++){
                int first;
                int last;
                if(i==0){
                    first = old.get(0)+1;
                }else{
                    first = old.get(i)-old.get(i-1);
                }
                if(i+k==old.size()){
                    last = student.length-old.get(i+k-1);
                }else {
                    last = old.get(i+k)-old.get(i+k-1);
                }
                //System.out.println(first+" "+last);
                answer = answer+first*last;
            }
        }
        return answer;
    }
}
