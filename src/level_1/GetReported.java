package level_1;

import java.util.StringTokenizer;

public class GetReported {
    public static int[] solution(String[] id_list, String[] report, int k){
        int size = id_list.length;
        int[] answer = new int[size];

        // 1. 누가 누구를 신고했는지 확인할 수 있는 자료구조 필요 (2차원 배열) , 신고 : 1
        int[][] reportCount = new int[size][size];
        // 2. report를 신고한 사람과 신고 당한사람 구분하기
        for(int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(report[i], " ");
            String client = st.nextToken();
            String reportedClient = st.nextToken();

            for(int j = 0; j < size; j++){
                for(int n = 0; n < size; n++){
                    if(id_list[j] == client && id_list[n] == reportedClient){
                        if(reportCount[j][n] == 0){
                            reportCount[j][n] = 1;
                        }
                    }
                }
            }
        }

        for(int i = 0; i < size; i++){
            int tmp = 0;
            for(int j = 0; j < size; j++){
                tmp += reportCount[j][i];
            }
            if(tmp >= k){
                for(int n = 0; n < size; n++){
                    if(reportCount[n][i] == 1){
                        answer[n]++;
                    }
                }
            }
        }


        return answer;
    }
}
