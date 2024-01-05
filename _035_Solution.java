public class _035_Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 0; i < count; i++) {
            answer += price * (i + 1);
        }
        if (money - answer < 0) {
            return answer - money;
        }
        return 0;
    }
}