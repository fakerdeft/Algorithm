import java.util.*;
import java.io.*;

// 좌표
class Point {
    int x, y;
    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int N, M;
    static int[][] map;
    static ArrayList<Point> houses = new ArrayList<>();
    static ArrayList<Point> chickens = new ArrayList<>();
    static boolean[] visited; // 치킨집 선택 여부 체크 (조합용)
    static int minCityChickenDistance = Integer.MAX_VALUE; // 정답(최소값)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 맵 정보 저장
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < N; j++) {
                int type = Integer.parseInt(st.nextToken());
                
                if (type == 1) {
                    houses.add(new Point(i, j));
                } else if (type == 2) {
                    chickens.add(new Point(i, j));
                }
            }
        }

        // 백트래킹 (치킨집 중 M개를 뽑음)
        visited = new boolean[chickens.size()];
        combination(0, 0);

        System.out.println(minCityChickenDistance);
    }

    // 백트래킹 (조합): 치킨집 중에서 M개를 선택하는 함수
    static void combination(int start, int count) {
        // M개를 다 뽑았으면 거리 계산 시작
        if (count == M) {
            calculateDistance();
            return;
        }

        for (int i = start; i < chickens.size(); i++) {
            visited[i] = true; // 선택 함
            combination(i + 1, count + 1);
            visited[i] = false; // 선택 안 함 (백트래킹)
        }
    }

    // 선택된 M개의 치킨집을 기준으로 도시의 치킨 거리를 계산
    static void calculateDistance() {
        int totalDistance = 0;

        for (Point house : houses) {
            int min = Integer.MAX_VALUE;

            // 각 집마다 "선택된 치킨집(visited가 true인 곳)" 과의 거리 중 최소값 찾기
            for (int i = 0; i < chickens.size(); i++) {
                if (visited[i]) { // 선택된 치킨집만 계산
                    int dist = Math.abs(house.x - chickens.get(i).x) 
                             + Math.abs(house.y - chickens.get(i).y);
                    min = Math.min(min, dist);
                }
            }
            totalDistance += min;
        }

        // 전체 도시 치킨 거리의 최솟값 갱신
        minCityChickenDistance = Math.min(minCityChickenDistance, totalDistance);
    }
}