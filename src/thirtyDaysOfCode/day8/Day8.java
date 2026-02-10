package thirtyDaysOfCode.day8;

import java.io.IOException;
import java.util.Scanner;

public class Day8 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            scan.nextLine();
            int [] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                int t = scan.nextInt();
                numbers[i]=t;}

            for (int i=numbers.length-1;i>=0;i--){
                System.out.printf(numbers[i]+" ");
            }

            scan.close();

        }
}
