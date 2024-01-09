public class _040_Solution {
    public int solution(int n) {
        String str = ""; // 3으로 나눈 나머지 결과를 담기 위한 문자열 변수 선언

        while (n != 0) { // 자연수 n이 0이 아닐때까지 3으로 나눈 나머지를 갱신하며 반복함
            str += n % 3;
            n /= 3;
        }

        int answer = Integer.parseInt(str, 3); // Integer.parseInt로 10진법으로 변환된 int값을 반환함
        return answer;
    }
}