import java.util.Arrays;

public class _034_Solution {
    public String solution(String s) {
        String answer = "";

        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);

        return new StringBuffer(new String(charArr)).reverse().toString();
    }
}