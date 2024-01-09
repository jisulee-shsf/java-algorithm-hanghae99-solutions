public class _037_Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length]; // 2차원 배열을 생성함

        for (int i = 0; i < arr1.length; i++) { // for문으로 arr1.length만큼 순회함
            for (int j = 0; j < arr1[i].length; j++) { // for문으로 arr1[i].length만큼 순회함
                answer[i][j] = arr1[i][j] + arr2[i][j]; // index 합의 결과를 answer의 index값으로 대입함 
            }
        }
        return answer;
    }
}