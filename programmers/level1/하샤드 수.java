// https://school.programmers.co.kr/learn/courses/30/lessons/12947

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = 0;
        int tmp = x;
        while (tmp > 0) {
            num += tmp % 10;
            tmp /= 10;
        }
        return x % num == 0;
    }
}