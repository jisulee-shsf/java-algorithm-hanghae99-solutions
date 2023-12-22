public class _017_Solution {
    public int[] solution(long n) {
        long num = n;
        int length = 0;

        while (num != 0) {
            num /= 10;
            length++;
        }

        int[] answer = new int[length];

        num = n;
        for (int i = 0; num != 0; i++) {
            answer[i] = (int)(num % 10);
            num /= 10;
        }
        return answer;
    }
}