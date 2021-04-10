package beak14501;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] schedule;
    static int money;
    static int rst;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(br.readLine());
        schedule = new int[day][2];
        rst = 0;
        money = 0;
        for(int i = 0; i<day; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            schedule[i][0] = Integer.parseInt(st.nextToken());
            schedule[i][1] = Integer.parseInt(st.nextToken());
        }
        dfs(day, 0);
        System.out.println(rst);
    }
    static void dfs(int day, int depth){
        int temp = money;
        for(int i=depth; i<day; i++) {
            money = temp;
            if (depth + schedule[i][0] < day) {                 //스케줄 했을때 시간이 남을경우
                money = money + schedule[i][1];
                dfs(day, depth + schedule[i][0]);
            } else if(depth + schedule[i][0] == day){           //스케줄이 딱 마지막날 끝날경우
                money = money + schedule[i][1];
                if(money>rst){
                    rst = money;
                }
            }else{                                              //스케줄을 기간이 안맞아서 못할경우
                if(money>rst){
                    rst = money;
                }
            }
            depth++;
        }
    }
}
