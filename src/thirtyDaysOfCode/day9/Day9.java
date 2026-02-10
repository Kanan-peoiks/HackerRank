package thirtyDaysOfCode.day9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
         scan.nextLine();


    Map<String, Integer> phoneBook= new HashMap<>();
        for (int i = 0; i < n; i++) {
        String name = scan.next();
        int phoneNumber = scan.nextInt();
        phoneBook.put(name, phoneNumber);
    }

        while (scan.hasNext()) {
        String query = scan.next();
        if (phoneBook.containsKey(query)) {
            System.out.println(query + "=" + phoneBook.get(query));
        } else {
            System.out.println("Not found");
        }
    }

    }
}
