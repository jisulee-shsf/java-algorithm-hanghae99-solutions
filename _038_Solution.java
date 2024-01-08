import java.util.Scanner;

public class _038_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < b; i++) { // 세로 길이 b만큼 for문이 순회하며 별을 출력함
            for(int j = 0; j < a; j++) { // 가로 길이 a만큼 for문이 순회하며 별을 출력함
                System.out.print("*"); // 별이 연속되게 출력되도록 println -> print으로 변경함
            }
            System.out.println(); // 한 줄이 출력될 때마다 줄이 바뀔 수 있도록 삽입함
        }
    }
}