import java.util.*;
import java.io.*;

public class Main {
    public static int solution(int[] a, int[] b){
        int answer = 0;

        for(int i = 0; i < a.length; i++){
            answer += (a[i] * b[i]);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

    }
}
