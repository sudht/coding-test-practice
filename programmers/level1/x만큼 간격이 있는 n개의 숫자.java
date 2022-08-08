// https://school.programmers.co.kr/learn/courses/30/lessons/12954

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        answer = new long [n];
        
        long temp = x;
        for (int i = 0; i < n; i++) {
            answer[i] = temp;
            temp = temp + x;
        }
        return answer;
    }
}