// https://school.programmers.co.kr/learn/courses/30/lessons/12950

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        int colSize = arr1.length;
        int rowSize = arr1[0].length;
        answer = new int[colSize][rowSize];
        
        for (int i = 0; i < colSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
                
        return answer;
    }
}