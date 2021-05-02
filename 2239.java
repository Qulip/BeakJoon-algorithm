package beak2239;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] sudoku = new int[9][9];
        for(int i=0; i<9; i++){
            int num = Integer.parseInt(br.readLine());
            for(int j=8; j>=0; j--){
                sudoku[i][j] = num%10;
                num = num/10;
            }
        }
        int[] now = next_zero(sudoku, 0, 0);
        make_sudoku(sudoku, now[0], now[1]);

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(sudoku[i][j]);
            }
            System.out.println();
        }
    }

    static boolean make_sudoku(int[][] sudoku, int now_col, int now_row){
        if(now_row==9){
            return true;
        }
        int[] next = next_zero(sudoku, now_col, now_row);
        boolean[] chk = new boolean[10];                        //t이 없는거 f있는거
        chk_row(sudoku, now_col, chk);
        chk_col(sudoku, now_row, chk);
        chk_square(sudoku, now_row, now_col, chk);
        for(int i=1; i<=9; i++) {
            if(chk[i]){
                sudoku[now_row][now_col] = i;
                boolean next_sudoku = make_sudoku(sudoku, next[0], next[1]);
                if(next_sudoku){
                    return true;
                }
                sudoku[now_row][now_col] = 0;
            }
        }
        return false;
    }
    static boolean chk_row(int[][] sudoku, int now_col, boolean[] chk){
        boolean[] nums = new boolean[10];
        for(int i=0; i<9; i++){
            chk[sudoku[now_col][i]] = false;
            if(nums[sudoku[now_col][i]]) {
                nums[sudoku[now_col][i]] = false;
            }else{
                return false;
            }
        }
        return true;
    }

    static boolean chk_col(int[][] sudoku, int now_row, boolean[] chk){
        boolean[] nums = new boolean[10];
        for(int i=0; i<9; i++){
            chk[sudoku[i][now_row]] = false;
            if(nums[sudoku[i][now_row]]) {
                nums[sudoku[i][now_row]] = false;
            }else{
                return false;
            }
        }
        return true;
    }

    static boolean chk_square(int[][] sudoku, int now_row, int now_col, boolean[] chk){
        boolean[] nums = new boolean[10];
        for(int i=now_col; i<now_col+3; i++){
            for(int j=now_row; j<now_row+3; j++) {
                chk[sudoku[now_col][now_row]] = false;
                if (nums[sudoku[now_col][now_row]]) {
                    nums[sudoku[now_col][now_row]] = false;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    static int[] next_zero(int[][] sudoku, int now_row, int now_col){
        int[] next = new int[2];
        for(int i = now_row; i<9; i++){
            if(i==now_row) {
                for (int j = now_col; j < 9; j++) {
                    if (sudoku[i][j] == 0) {
                        next[0] = i;
                        next[1] = j;
                        return next;
                    }
                }
            }else{
                for (int j = 0; j < 9; j++) {
                    if (sudoku[i][j] == 0) {
                        next[0] = i;
                        next[1] = j;
                        return next;
                    }
                }
            }
        }
        next[0] = 9;
        next[1] = 9;
        return next;
    }
}
/*
103000509
002109400
000704000
300502006
060000050
700803004
000401000
009205800
804000107

 */