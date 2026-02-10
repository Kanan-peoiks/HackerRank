package thirtyDaysOfCode.day10;

import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int factorial = 1;
        for (int i = 1; i<=n; i++){
            factorial = factorial * i;
        }
        //5 4 3 2 1
        System.out.println(factorial);

        scan.close();
    }
}
