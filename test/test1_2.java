package test1_2;


public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"abaaaa","aaa","abaaaaaa","fzfffffffa"}, 2, 2));
        System.out.println(solution(new String[]{"yxxy","xxyyy"}, 2, 1));
        System.out.println(solution(new String[]{"yxxy","xxyyy","yz"}, 2, 1));
        System.out.println(solution(new String[]{"xy","xy"}, 1, 1));
    }
    public static String solution(String[] research,int n, int k){
        String answer = "";
        int[][] search = new int[research.length][26];
        boolean[] searched = new boolean[26];
        for(int i=0; i<research.length; i++){
            for(int j=0; j<research[i].length(); j++){
                searched[research[i].charAt(j)-'a']=true;
                search[i][research[i].charAt(j)-'a']++;
            }
        }
        int[] best_time = new int[26];
        boolean chk = false;
        for(int i=0; i<26; i++){
            if(!searched[i]){
                continue;
            }
            for(int j=0; j<=research.length-n; j++){
                int all_time = 0;
                for(int l=j; l<j+n; l++){
                    if(search[l][i]<k){
                        break;
                    }
                    all_time = all_time + search[l][i];
                }
                if(all_time >= 2*n*k){
                    chk = true;
                    best_time[i]++;
                }
            }
        }
        if(chk) {
            int best = 0;
            char tmp = 'a';
            for (int i = 0; i < 26; i++) {
                if (!searched[i]) {
                    continue;
                }
                if (best < best_time[i]) {
                    best = best_time[i];
                    tmp = (char) ('a'+i);
                }
            }
            answer = answer+tmp;
        }else{
            answer = "None";
        }
        return answer;
    }
}
