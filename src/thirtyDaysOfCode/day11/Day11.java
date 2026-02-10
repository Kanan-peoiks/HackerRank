package thirtyDaysOfCode.day11;

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String binary = Integer.toBinaryString(n); // decimal → binary

        int maxCount = 0;
        int current = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                current++;
                if (current > maxCount) {
                    maxCount = current;
                }
            } else {
                current = 0;
            }
        }

        System.out.println(maxCount);
    }
}
