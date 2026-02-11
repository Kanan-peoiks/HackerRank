package thirtyDaysOfCode.day18;

import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) throws Exception {
        Calculator cal = new Calculator();
        Scanner scan = new Scanner(System.in);
        int z = scan.nextInt();
        String[] results = new String[z];
        for (int i = 0; i < z; i++) {
            int n = scan.nextInt();
            int p = scan.nextInt();
            try {
                results[i] = String.valueOf(cal.power(n, p));
            } catch (Exception e) {
                results[i] = e.getMessage();
            }
        }
        for (String r : results){
            System.out.println(r);
        }
        scan.close();
    }
}