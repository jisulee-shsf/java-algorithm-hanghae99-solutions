public class _036_Solution {
    public boolean solution(String s) {
        boolean answer = true; // 기본값을 true로 설정함

        if (!(s.length() == 4 || s.length() == 6)) { // 만약 문자열의 길이가 4 또는 6이 아닌 경우, false를 반환함
            return false;
        }
        for (int i = 0; i < s.length(); i++) { // 문자열의 길이가 4 또는 6인 경우, for문을 순회함
            if (s.charAt(i) < 48 || s.charAt(i) > 57) { // 아스키 코드 기준 숫자에 해당하지 않을 경우, false를 반환함
                return false;
            }
        }
        return answer; // 이외의 경우, 기본값인 true가 반환됨
    }
}