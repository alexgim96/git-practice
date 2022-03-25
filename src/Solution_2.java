public class Solution_2 {

    public static int[][] answer;

    public static void bfs(int start_x, int start_y, int dir, int n, boolean clockwise){
        if(clockwise){
            if(n%2 == 0){
                if(n == 2) return;
                if(dir == 0){
                    int tmp = start_y;
                    int dy = start_y;
                    for(int i = start_y, count = 0; count == n-1; i--){
                        tmp++;
                        count++;
                        answer[start_x][i] = tmp;
                        dy = i;
                    }
                    bfs(start_x, dy, 1, n-1, clockwise);
                }else if(dir == 1){
                    int tmp = start_x;
                    int dx = start_x;
                    for(int i = start_x; i < n-1; i++){
                        tmp++;
                        answer[i][start_y] = tmp;
                        dx = i;
                    }
                    bfs(dx, start_y, 2, n-1, clockwise);
                }else if(dir == 2){
                    int tmp = start_y;
                    int dy = start_y;
                    for(int i = start_y; i < n-1; i++){
                        tmp++;
                        answer[start_x][i] = tmp;
                        dy = i;
                    }
                    bfs(start_x, dy, 3, n-1, clockwise);
                }else{
                    int tmp = start_x;
                    int dx = start_x;
                    for(int i = start_x, count = 0; count == n-1; i--){
                        tmp++;
                        count++;
                        answer[i][start_y] = tmp;
                        dx = i;
                    }
                    bfs(dx, start_y, 0, n-1, clockwise);
                }
            }else{
                if(n == 3) return;
                if(dir == 0){
                    int tmp = start_y;
                    int dy = start_y;
                    for(int i = start_y, count = 0; count == n-1; i--){
                        tmp++;
                        count++;
                        answer[start_x][i] = tmp;
                        dy = i;
                    }
                    bfs(start_x, dy, 1, n-1, clockwise);
                }else if(dir == 1){
                    int tmp = start_x;
                    int dx = start_x;
                    for(int i = start_x; i < n-1; i++){
                        tmp++;
                        answer[i][start_y] = tmp;
                        dx = i;
                    }
                    bfs(dx, start_y, 2, n-1, clockwise);
                }else if(dir == 2){
                    int tmp = start_y;
                    int dy = start_y;
                    for(int i = start_y; i < n-1; i++){
                        tmp++;
                        answer[start_x][i] = tmp;
                        dy = i;
                    }
                    bfs(start_x, dy, 3, n-1, clockwise);
                }else{
                    int tmp = start_x;
                    int dx = start_x;
                    for(int i = start_x, count = 0; count == n-1; i--){
                        tmp++;
                        count++;
                        answer[i][start_y] = tmp;
                        dx = i;
                    }
                    bfs(dx, start_y, 0, n-1, clockwise);
                }
            }
        }else{
            if(n%2 == 0){
                if(n == 2) return;
                if(dir == 0){
                    int tmp = start_y;
                    int dy = start_y;
                    for(int i = start_y, count = 0; count == n-1; i--){
                        tmp++;
                        count++;
                        answer[start_x][i] = tmp;
                        dy = i;
                    }
                    bfs(start_x, dy, 3, n-1, clockwise);
                }else if(dir == 1){
                    int tmp = start_x;
                    int dx = start_x;
                    for(int i = start_x; i < n-1; i++){
                        tmp++;
                        answer[i][start_y] = tmp;
                        dx = i;
                    }
                    bfs(dx, start_y, 0, n-1, clockwise);
                }else if(dir == 2){
                    int tmp = start_y;
                    int dy = start_y;
                    for(int i = start_y; i < n-1; i++){
                        tmp++;
                        answer[start_x][i] = tmp;
                        dy = i;
                    }
                    bfs(start_x, dy, 1, n-1, clockwise);
                }else{
                    int tmp = start_x;
                    int dx = start_x;
                    for(int i = start_x, count = 0; count == n-1; i--){
                        tmp++;
                        answer[i][start_y] = tmp;
                        dx = i;
                    }
                    bfs(dx, start_y, 2, n-1, clockwise);
                }
            }else{
                if(n == 3) return;
                if(dir == 0){
                    int tmp = start_y;
                    int dy = start_y;
                    for(int i = start_y, count = 0; count == n-1; i--){
                        tmp++;
                        count++;
                        answer[start_x][i] = tmp;
                        dy = i;
                    }
                    bfs(start_x, dy, 3, n-1, clockwise);
                }else if(dir == 1){
                    int tmp = start_x;
                    int dx = start_x;
                    for(int i = start_x; i < n-1; i++){
                        tmp++;
                        answer[i][start_y] = tmp;
                        dx = i;
                    }
                    bfs(dx, start_y, 0, n-1, clockwise);
                }else if(dir == 2){
                    int tmp = start_y;
                    int dy = start_y;
                    for(int i = start_y; i < n-1; i++){
                        tmp++;
                        answer[start_x][i] = tmp;
                        dy = i;
                    }
                    bfs(start_x, dy, 1, n-1, clockwise);
                }else{
                    int tmp = start_x;
                    int dx = start_x;
                    for(int i = start_x, count = 0; count == n-1; i--){
                        tmp++;
                        count++;
                        answer[i][start_y] = tmp;
                        dx = i;
                    }
                    bfs(dx, start_y, 2, n-1, clockwise);
                }
            }
        }
    }

    public static int[][] solution(int n, boolean clockwise){
        answer = new int[n][n];

        if(clockwise) {
            bfs(0, 0, 1, n, clockwise);
            bfs(n - 1, 0, 2, n, clockwise);
            bfs(0, n - 1, 3, n, clockwise);
            bfs(n - 1, n - 1, 0, n, clockwise);
        }else{
            bfs(0, 0, 2, n, clockwise);
            bfs(n - 1, 0, 3, n, clockwise);
            bfs(0, n - 1, 1, n, clockwise);
            bfs(n - 1, n - 1, 0, n, clockwise);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, true));
    }

}
