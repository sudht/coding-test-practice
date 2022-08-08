// https://school.programmers.co.kr/learn/courses/30/lessons/12943

class Solution {
    public int solution(int num) {
        int answer = 0;
        int i = 0;
        long numL = (long) num;
        for (; i < 500; i++) {
            if (numL == 1) {
                return i;
            }
            
            if (numL % 2 == 0) {
                numL /= 2;
            } else {
                numL = numL * 3 + 1;
            }
        }
        return -1;
    }
}