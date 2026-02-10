package thirtyDaysOfCode.day12;

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {


        int max;
        int sum = Integer.MIN_VALUE;;
        max = sum;
        int[][] arr = new int[6][6];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {

                int a = arr[i][j];
                int b = arr[i][j + 1];
                int c = arr[i][j + 2];
                int d = arr[i + 1][j + 1];
                int e = arr[i + 2][j];
                int f = arr[i + 2][j + 1];
                int g = arr[i + 2][j + 2];

                sum = a + b + c + d + e + f + g;

                if (max < sum){
                    max =sum;}
            }
        }
        System.out.println(max);
    }
}
