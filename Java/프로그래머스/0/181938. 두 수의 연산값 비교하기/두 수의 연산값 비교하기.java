class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int a_b = Integer.parseInt(("" + a) + ("" + b));
        int a_b_2 = a * b * 2;
        return a_b >= a_b_2? a_b : a_b_2;
    }
}