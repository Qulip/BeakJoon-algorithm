import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static String input = "1 1 1\n"+
            "2 2 2\n" +
            "10 4 6\n" +
            "50 50 50\n" +
            "-1 7 18\n" +
            "-1 -1 -1\n";
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new StringReader(input));
        StringBuilder sb = new StringBuilder();
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a==-1&&b==-1&&c==-1){
                break;
            }
            if()
        }
        System.out.println(sb);
    }
}
