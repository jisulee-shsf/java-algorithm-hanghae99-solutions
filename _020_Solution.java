import java.util.Arrays;

public class _020_Solution {
    public long solution(long n) {
        long answer = 0;

        String[] strArr = String.valueOf(n).split("");
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        for (String s : strArr) {
            sb.append(s);
        }
        answer = Long.parseLong(sb.reverse().toString());
        return answer;
    }
}