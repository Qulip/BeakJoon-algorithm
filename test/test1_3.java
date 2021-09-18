package test1_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(solution(new int[][]{{1, 5, 2, 3}, {2, 2, 3, 2}, {3, 1, 3, 3}, {5, 2, 1, 5}, {7, 1, 1, 1}, {9, 1, 1, 1}, {10, 2, 2, 9}})));
        //System.out.println(Arrays.toString(solution(new int[][]{{1, 2, 1, 5}, {2, 1, 2, 100}, {3, 2, 1, 5}, {5, 2, 1, 5}})));
        System.out.println(Arrays.toString(solution(new int[][]{{0, 2, 3, 1}, {5, 3, 3, 1}, {10, 2, 4, 1}})));
    }
    public static int[] solution(int[][] jobs){
        ArrayList<Integer> tmp =  new ArrayList<>();
        ArrayList<int[]> waiting = new ArrayList<>();
        int queued = 0;
        int time = 0;
        boolean working = false;
        while(true){
            for(int i=queued; i < jobs.length; i++){
                if(time>=jobs[i][0]){
                    queued++;
                    if(working){
                        waiting.add(jobs[i]);
                    }else {
                        tmp.add(jobs[i][2]);
                        time = time + jobs[i][1];
                        working = true;
                    }
                }
            }
            if(!working||waiting.size()==0){
                time++;
                continue;
            }
            if(waiting.size()>0){
                int[] priority = new int[100];
                boolean chk = false;
                for(int i=0; i<waiting.size(); i++){
                    int[] task = waiting.get(i);
                    if(tmp.get(tmp.size()-1)==task[2]){
                        waiting.remove(task);
                        time = time+task[0];
                        working = true;
                        chk = true;
                        break;
                    }
                    priority[task[2]] = priority[task[2]]+task[3];
                }
                if(!chk){
                    int best_pri = 0;
                    int next = 0;
                    for(int i=0; i<100; i++){
                        if(priority[i]>best_pri){
                            next = i;
                            best_pri = priority[i];
                        }
                    }
                    tmp.add(next);
                    for(int i=0; i<waiting.size(); i++){
                        int[] task = waiting.get(i);
                        if(task[2]==next){
                            time = time+task[0];
                            waiting.remove(task);
                        }
                    }
                }
            }
            if(queued== jobs.length && waiting.size()==0){
                break;
            }
        }

        int[] answer = new int[tmp.size()];
        for(int i=0; i<tmp.size(); i++){
            answer[i] = tmp.get(i);
        }
        return answer;
    }
}
