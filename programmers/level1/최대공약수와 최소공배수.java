// https://school.programmers.co.kr/learn/courses/30/lessons/12940

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        
        int a = n;
        int b = m;
        int r;
        for (;;) {
            r = a % b;
            if (r == 0) {
                answer[0] = b;
                break;
            }
            a = b;
            b = r;
        }
        answer[1] = n * m / answer[0];
        return answer;
    }
}