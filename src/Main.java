import java.util.*;
import java.io.*;

public class Main {
    public static int solution(int[] nums){
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length-2; i++){
            for(int j = i+1; j < nums.length-1; j++){
                for(int k = j+1; k < nums.length; k++){
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        for(Integer x : list){
            int count = 2;
            answer++;

            while(count < x){
                if(x % count == 0){
                    answer--;
                    break;
                }
                count++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

    }
}
