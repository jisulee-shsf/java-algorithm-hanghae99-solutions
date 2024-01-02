public class _029_Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[arr.length - 1];

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int num = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == min) {
                continue;
            } else {
                answer[num++] = arr[j];
            }
        }
        return answer;
    }
}