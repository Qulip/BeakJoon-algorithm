package quiz2;

import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        String rst1 = solution(new String[]{"08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"});
        String rst2 = solution(new String[]{"01:00", "08:00", "15:00", "15:04", "23:00", "23:59"});
        System.out.println(rst1+"\n"+rst2);
    }
    public static String solution(String[] log) {
        int rst = 0;
        String answer = "";
        for(int i=1; i<log.length; i=i+2){
            StringTokenizer st1 = new StringTokenizer(log[i-1], ":");
            StringTokenizer st2 = new StringTokenizer(log[i], ":");
            int s_hour = Integer.parseInt(st1.nextToken());
            int e_hour = Integer.parseInt(st2.nextToken());
            int s_min = Integer.parseInt(st1.nextToken());
            int e_min = Integer.parseInt(st2.nextToken());
            int study = (e_hour-s_hour)*60 + e_min - s_min;
            if(study>105){
                rst = rst + 105;
            }else if(!(study<5)){
                rst = rst + study;
            }
        }
        int rst_time = rst/60;
        int rst_min = rst%60;
        if(rst_time<10){
            answer = "0"+ rst_time + ":";
        }else{
            answer = rst_time + ":";
        }
        if(rst_min<10){
            answer = answer+"0"+rst_min;
        }else{
            answer = answer + rst_min;
        }
        return answer;
    }
}
